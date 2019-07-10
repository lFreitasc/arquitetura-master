package br.utfpr.architecture.DTO;


import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AulasDoPlanoSubstituicaoDTO implements Serializable {
   
    private Long idAulaPlanoSubstituicao;
    private String dataDaAulaSubstituida;
    private String quantidadeDeAulas;
    private ProfessorDTO professorSubstituto;
    private TurmaDTO turma;
    private SolicitacaoPlanoDeSubstituicaoDTO idPlanoDeAula;

   

 
  }
    
    
   

