package br.utfpr.architecture.Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Class implements Serializable{
    @Id @GeneratedValue
    private Long id;
    
    @ManyToMany
    private Set<Student> alunos;

    @ManyToOne
    private Professor professor;
 }