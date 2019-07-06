package br.utfpr.architecture.Entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SolicitacaoPlanoDeSubstituicao implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idPlanoDeAula;
    private String dataSolicitacao;
    private String motivo;
    private String parecerCoordenacao;
    private String observacao;
    private boolean aprovado;
    
    
    @ManyToOne
    private Professor professorRequerente;
    
    @ManyToOne
    private Professor professorSubstituto;
    
    @ManyToOne
    private Professor professorCoordenador;


    public SolicitacaoPlanoDeSubstituicao(String homeprincipal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdPlanoDeAula(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdPlanoDeAula(Long idPlanoDeAula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     
  
   
}
