package br.utfpr.architecture.Entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Turma implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;
    private String nomeTurma;
    
    @ManyToOne
    @JoinColumn
    private Curso idCurso;
    @ManyToOne
    @JoinColumn
    private Disciplina idDisciplina;
    @ManyToOne
    @JoinColumn
    private Sala idSala;
    
}
