package br.utfpr.architecture.DTO;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CargoDTO implements Serializable{
    
    private int idCargo;
    private String nome;
   
   
  
        
}