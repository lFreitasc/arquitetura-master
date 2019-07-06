/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servico;

import br.utfpr.architecture.DTO.AulasDoPlanoSubstituicaoDTO;
import br.utfpr.architecture.DTO.CargoDTO;
import br.utfpr.architecture.DTO.CursoDTO;
import br.utfpr.architecture.DTO.DepartamentoDTO;
import br.utfpr.architecture.DTO.DisciplinaDTO;
import br.utfpr.architecture.DTO.ProfessorDTO;
import br.utfpr.architecture.DTO.SalaDTO;
import br.utfpr.architecture.DTO.SolicitacaoPlanoDeSubstituicaoDTO;
import br.utfpr.architecture.DTO.TurmaDTO;
import br.utfpr.architecture.Entity.AulasDoPlanoSubstituicao;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel
 */

    @RestController
    public class AulaDoPlanoServico {
 
   	private final List<AulasDoPlanoSubstituicaoDTO> aulas;
        private final List<ProfessorDTO> professorSubstituto;
        private final List<DepartamentoDTO> departamento;
        private final List<CargoDTO> cargo;
        private final List<TurmaDTO> turma;
        private final List<SalaDTO> sala;
        private final List<CursoDTO> curso;
        private final List<DisciplinaDTO> disciplina;
       // private final List<SolicitacaoPlanoDeSubstituicaoDTO> plano;
        
        public AulaDoPlanoServico(SolicitacaoPlanoDeSubstituicaoDTO plano) {
        
         sala = Stream.of(
                 SalaDTO.builder().idSala(Long.MIN_VALUE).codigoSala("A01").build(),
                 SalaDTO.builder().idSala(Long.MIN_VALUE).codigoSala("A02").build(),
                 SalaDTO.builder().idSala(Long.MIN_VALUE).codigoSala("A03").build()
         ).collect(Collectors.toList());
         
         curso = Stream.of(
                 CursoDTO.builder().idCurso(Long.MIN_VALUE).nomeCurso("Engenharia de Software").build(),
                 CursoDTO.builder().idCurso(Long.MIN_VALUE).nomeCurso("Engenharia de computação").build(),
                 CursoDTO.builder().idCurso(Long.MIN_VALUE).nomeCurso("Analise e desenvolvimento").build()
         ).collect(Collectors.toList());
         
         disciplina = Stream.of(
                 DisciplinaDTO.builder().idDisciplina(Long.MIN_VALUE).nomeDisciplina("Arquitetura de Software").build(),
                 DisciplinaDTO.builder().idDisciplina(Long.MIN_VALUE).nomeDisciplina("Teoria da computação").build()
                 
         ).collect(Collectors.toList());
         
         turma = Stream.of(
                 TurmaDTO.builder().idTurma(Long.MIN_VALUE).nomeTurma("T1").sala(sala.get(1)).curso(curso.get(1)).disciplina(disciplina.get(1)).build(),
                 TurmaDTO.builder().idTurma(Long.MIN_VALUE).nomeTurma("T2").sala(sala.get(2)).curso(curso.get(1)).disciplina(disciplina.get(2)).build(),
                 TurmaDTO.builder().idTurma(Long.MIN_VALUE).nomeTurma("T3").sala(sala.get(3)).curso(curso.get(1)).disciplina(disciplina.get(1)).build()
         ).collect(Collectors.toList());
         
         cargo = Stream.of(
                 CargoDTO.builder().idCargo(1).nome("Professor").build(),
                 CargoDTO.builder().idCargo(2).nome("Professor Substituto").build(),
                 CargoDTO.builder().idCargo(3).nome("Chefe de Departamento").build()
         ).collect(Collectors.toList());
            
            
         departamento = Stream.of(
                 DepartamentoDTO.builder().idDepartamento(Long.MIN_VALUE).nomeDepartamento("Computacao").build(),
                 DepartamentoDTO.builder().idDepartamento(Long.MIN_VALUE).nomeDepartamento("eletrica").build()
         ).collect(Collectors.toList());
            
         professorSubstituto = Stream.of(
                 ProfessorDTO.builder().idProfessor(Long.MIN_VALUE).nome("Tiago").departamento(departamento.get(1)).Cargo(cargo.get(1)).build(),
                 ProfessorDTO.builder().idProfessor(Long.MIN_VALUE).nome("Ricardo").departamento(departamento.get(1)).Cargo(cargo.get(2)).build(),
                 ProfessorDTO.builder().idProfessor(Long.MIN_VALUE).nome("Sandro").departamento(departamento.get(1)).Cargo(cargo.get(3)).build(),
                 ProfessorDTO.builder().idProfessor(Long.MIN_VALUE).nome("Santos").departamento(departamento.get(1)).Cargo(cargo.get(2)).build(),
                 ProfessorDTO.builder().idProfessor(Long.MIN_VALUE).nome("Renato").departamento(departamento.get(1)).Cargo(cargo.get(1)).build()
         ).collect(Collectors.toList());
                          
         aulas = Stream.of(
            AulasDoPlanoSubstituicaoDTO.builder().idAulaPlanoSubstituicao(Long.MIN_VALUE).dataDaAulaSubstituida("10/07/2019").quantidadeDeAulas("3").turma(turma.get(1)).professorSubstituto(professorSubstituto.get(2)).idPlanoDeAula(plano).build()
            
         ).collect(Collectors.toList());
    }
        
     @GetMapping ("/servico/aulaPlano")
    public ResponseEntity<List<AulasDoPlanoSubstituicaoDTO>> listar() {
    // public List<PaisDTO> listar() {
        // return paises;
        return ResponseEntity.ok(aulas);
    }

    @GetMapping ("/servico/aulaPlano/{id}")
    public ResponseEntity<AulasDoPlanoSubstituicaoDTO> listarPorId(@PathVariable int id) {
        Optional<AulasDoPlanoSubstituicaoDTO> aulaEncontrado = aulas.stream().filter(p -> p.getIdAulaPlanoSubstituicao() == id).findAny();

        return ResponseEntity.of(aulaEncontrado);
    }

    @PostMapping ("/servico/aulaPlano")
    public ResponseEntity<AulasDoPlanoSubstituicaoDTO> criar (@RequestBody AulasDoPlanoSubstituicaoDTO aula) {
        aula.setIdAulaPlanoSubstituicao(Long.MIN_VALUE);       
        aulas.add(aula);
        return ResponseEntity.status(201).body(aula);
    }

    @DeleteMapping ("/servico/aulaPlano/{id}")
    public ResponseEntity excluir (@PathVariable int id) {
        
        if (aulas.removeIf(aula -> aula.getIdAulaPlanoSubstituicao() == id))
            return ResponseEntity.noContent().build();

        else
            return ResponseEntity.notFound().build();
    }

    @PutMapping ("/servico/aulaPlano/{id}")
    public ResponseEntity<AulasDoPlanoSubstituicaoDTO> alterar (@PathVariable int id, @RequestBody AulasDoPlanoSubstituicaoDTO aula) {
        Optional<AulasDoPlanoSubstituicaoDTO> aulasExistente = aulas.stream().filter(p -> p.getIdAulaPlanoSubstituicao() == id).findAny();

        aulasExistente.ifPresent(p -> {
            p.setDataDaAulaSubstituida(aula.getDataDaAulaSubstituida());
            p.setProfessorSubstituto(aula.getProfessorSubstituto());
            p.setQuantidadeDeAulas(aula.getQuantidadeDeAulas());
            p.setTurma(aula.getTurma());
            p.setIdPlanoDeAula(aula.getIdPlanoDeAula());
            p.setIdAulaPlanoSubstituicao(aula.getIdAulaPlanoSubstituicao());
          
        });

        return ResponseEntity.of(aulasExistente);
    }
}

