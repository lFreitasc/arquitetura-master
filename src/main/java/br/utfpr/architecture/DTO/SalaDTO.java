package br.utfpr.architecture.DTO;


import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SalaDTO implements Serializable {
  
    private Long idSala;
    private String codigoSala;
    private String blocoSala;
    
   
}
