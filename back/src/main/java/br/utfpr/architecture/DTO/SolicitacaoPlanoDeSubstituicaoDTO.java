package br.utfpr.architecture.DTO;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SolicitacaoPlanoDeSubstituicaoDTO implements Serializable {
   
    private Long idPlanoDeAula;
    private String dataSolicitacao;
    private String motivo;
    private String parecerCoordenacao;
    private String observacao;
    private boolean aprovado;
    
    

   
}
