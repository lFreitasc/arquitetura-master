package br.utfpr.architecture.DTO;


import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurmaDTO implements Serializable {
   
    private Long idTurma;
    private String nomeTurma;
    
   
 
    private CursoDTO curso;
  
    private DisciplinaDTO disciplina;
  
    private SalaDTO sala;
    
}
