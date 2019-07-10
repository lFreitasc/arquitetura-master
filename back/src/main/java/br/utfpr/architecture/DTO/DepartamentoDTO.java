/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.architecture.DTO;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartamentoDTO implements Serializable {

    private Long idDepartamento;
    private String nomeDepartamento;
    
   
}
