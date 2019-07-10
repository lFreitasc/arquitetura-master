package br.utfpr.architecture.DTO;


import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DisciplinaDTO implements Serializable {
  
    private Long idDisciplina;
    private String nomeDisciplina;
    
  
}
