package br.utfpr.architecture.Entity;


import java.io.Serializable;
import javax.persistence.Column;

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
    @Column(name = "idProfessor")
    @ManyToOne
    private Professor idProfessorRequerente;
    @Column(name = "idProfessor")
    @ManyToOne
    private Professor idProfessorSubstituto;
    @Column(name = "idProfessor")
    @ManyToOne
    private Professor idProfessorCoordenador;
   
}
