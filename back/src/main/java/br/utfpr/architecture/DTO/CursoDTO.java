package br.utfpr.architecture.DTO;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CursoDTO implements Serializable {
 
    private Long idCurso;
    private String nomeCurso;

    private DepartamentoDTO departamento;
    
    
}
