/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servico;

import br.utfpr.architecture.DTO.AulasDoPlanoSubstituicaoDTO;
import br.utfpr.architecture.DTO.SolicitacaoPlanoDeSubstituicaoDTO;
import br.utfpr.architecture.Entity.SolicitacaoPlanoDeSubstituicao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel
 */

@RestController
public class SolicitacaoSubstituicaoServico {

    private  List<SolicitacaoPlanoDeSubstituicaoDTO> solicita;
    private  List<AulasDoPlanoSubstituicaoDTO> aulas;
    
      
	@Autowired
	private SolicitacaoSubstituicaoServico substituicaoServico;

	@GetMapping("/solicitacao")
	public List<SolicitacaoPlanoDeSubstituicao> PlanodeSolicitacao(@PathVariable Long idPlanoDeAula) {
		return substituicaoServico.retrievePlanoDeAulas(idPlanoDeAula);
	}
        
        
        @Autowired
	private br.utfpr.architecture.negocio.substituicaoNegocio aulaPlanoServico;
        @GetMapping("/solicitacao/aulaPlano")
        
	public List<AulasDoPlanoSubstituicaoDTO> retrieveAulasForSolicitacao(@PathVariable Long idAulaPlanoSubstituicao) throws Exception {
        return null;
	//try{
            
      //      if (aulaPlanoServico.PlanodeSolicitacao(idAulaPlanoSubstituicao).size() > 6){
       //      throw new Exception("Erro: Quantidade de aulas no Plano de aula maior que 6");
        //    }
        //}catch(Exception ex){
         //    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        //}
          //  return aulaPlanoServico.retrieveAulas(idAulaPlanoSubstituicao);
	}
        
        @Autowired
	private br.utfpr.architecture.negocio.substituicaoNegocio aprovaPlanoService;

	@GetMapping("/solicitacao/aprovaPlano")
	public List<SolicitacaoPlanoDeSubstituicao> aprovaPlanodeSolicitacao(@PathVariable Long idPlanoDeAula) {
		return substituicaoServico.retrievePlanoDeAulas(idPlanoDeAula);
	}
        
         @Autowired
	private br.utfpr.architecture.negocio.substituicaoNegocio enviaListaChamada;

	@GetMapping("/solicitacao/enviarListaChamada")
        public void upload(String pasta, String nomeDoArquivo,InputStream arquivoCarregado) throws FileNotFoundException {
            String caminhoArquivo = pasta + "/" + nomeDoArquivo;
            File novoArquivo = new File(caminhoArquivo);
            FileOutputStream saida = new FileOutputStream(novoArquivo);
           
        }
        
        
        

    private List<SolicitacaoPlanoDeSubstituicao> retrievePlanoDeAulas(Long idPlanoDeAula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<AulasDoPlanoSubstituicaoDTO> retrieveAulas(Long idAulaPlanoSubstituicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

