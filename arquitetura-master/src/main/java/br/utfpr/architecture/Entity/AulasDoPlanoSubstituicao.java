package br.utfpr.architecture.Entity;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AulasDoPlanoSubstituicao implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idAulaPlanoSubstituicao;
    private String dataDaAulaSubstituida;
    private String horaDaAulaProposta;
    private String horarioAulaProposta;
    private String quantidadeDeAulas;
    private String quantidadeTotaldeAulas;

    @OneToOne
    private SolicitacaoPlanoDeSubstituicao idPlanoDeAula;
    @ManyToOne
    @Column(name = "idProfessor")    
    private Professor idProfessorSubstituto;
    @ManyToOne
    private Turma idTurma;
    
    
   
}
