package br.utfpr.architecture.DTO;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfessorDTO implements Serializable{

    
    private Long idProfessor;
    private String nome;
    
    
    private CargoDTO Cargo;
   
    private DepartamentoDTO departamento;
 
        
}