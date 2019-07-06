package br.utfpr.architecture.negocio;

import br.utfpr.architecture.DTO.ProfessorDTO;
import br.utfpr.architecture.Entity.SolicitacaoPlanoDeSubstituicao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/home") 
public class HomeController {
     
    @RequestMapping( value = { "/" , "" ,"/solicitacao" }) 
    public SolicitacaoPlanoDeSubstituicao Solicitacao(){
       
        return new SolicitacaoPlanoDeSubstituicao("home/solicitacao");
    }
     
    @RequestMapping( "/addAulas" ) 
    public SolicitacaoPlanoDeSubstituicao addAulas(){
         
        return new SolicitacaoPlanoDeSubstituicao("home/addAula");
    }
    
    @RequestMapping( "/aprovaSubstituicao" ) 
    public ProfessorDTO aprovaSubstituicao(){
        
        return null; 
    }
     
}