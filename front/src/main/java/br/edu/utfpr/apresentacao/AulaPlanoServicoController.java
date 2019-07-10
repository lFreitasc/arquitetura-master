package br.edu.utfpr.apresentacao;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AulaPlanoServicoController {

    @GetMapping("/aula-plano-servico")
    public String inicial(Model data) throws JsonSyntaxException, UnirestException {

        AulaPlanoServicoModel arrayAulasPlanoServico[] = new Gson()
                    .fromJson(
                        Unirest
                            .get("http://localhost:8081/servico/aulaPlano")
                            .asJson()
                            .getBody()
                            .toString(), 
                            AulaPlanoServicoModel[].class
                    );

        data.addAttribute("planeDeAulas", arrayAulasPlanoServico);

        return "planoAulas-view";
    }

    @PostMapping ("/aula-plano-servico/criar")
    public String criar(AulaPlanoServicoModel planoAula) throws UnirestException {

            Unirest.post("http://localhost:8081/servico/aulaPlano")
                .header("Content-type", "application/json")
                .header("accept", "application/json")
                .body(new Gson().toJson(pais, PaisModel.class))
                .asJson();

        return "redirect:/aula-plano-servico";
    }

    @GetMapping ("/aula-plano-servico/excluir")
    public String excluir (@RequestParam int id) throws UnirestException {

        Unirest
            .delete("http://localhost:8081/servico/aulaPlano/{id}")
            .routeParam("id", String.valueOf(id))
            .asJson();

        return "redirect:/aula-plano-servico";
    }

    @GetMapping ("/aula-plano-servico/prepara-alterar")
    public String preparaAlterar (@RequestParam int id, Model data) throws JsonSyntaxException, UnirestException {

        AulaPlanoServicoModel planoAulaExistente = new Gson()
            .fromJson(
                Unirest
                    .get("http://localhost:8081/servico/pais/{id}")
                    .routeParam("id", String.valueOf(id))
                    .asJson()
                    .getBody()
                    .toString(),
                    AulaPlanoServicoModel.class
            );

        data.addAttribute("planoAulaAtual", planoAulaExistente);

        AulaPlanoServicoModel arrayAulasPlanoServico[] = new Gson()
        .fromJson(
            Unirest
                .get("http://localhost:8081/servico/aulaPlano")
                .asJson()
                .getBody()
                .toString(), 
                AulaPlanoServicoModel[].class
        );

        data.addAttribute("planeDeAulas", arrayAulasPlanoServico);

        return "solicitacaoSubstituicaoServico-view";
    }

    @PostMapping ("/aula-plano-servico/alterar")
    public String alterar (AulaPlanoServicoModel planoAulaAlterado) throws UnirestException {

        Unirest
            .put("http://localhost:8081/servico/aulaPlano/{id}")
            .routeParam("id", String.valueOf(planoAulaAlterado.getId()))
            .header("Content-type", "application/json")
            .header("accept", "application/json")
            .body(new Gson().toJson(planoAulaAlterado, AulaPlanoServicoModel.class))
            .asJson();

        return "redirect:/aula-plano-servico";
    }
}