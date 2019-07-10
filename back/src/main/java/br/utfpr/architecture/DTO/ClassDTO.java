package br.utfpr.architecture.DTO;

import java.io.Serializable;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClassDTO implements Serializable{
    
    private Long id;
    
  
    private Set<StudentDTO> alunos;

    private ProfessorDTO professor;
 }