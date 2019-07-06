package br.utfpr.architecture.DTO;

import java.io.Serializable;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO implements Serializable{

    private Long id;
    
    private String name;

    private Set<Class> aulas;

 }