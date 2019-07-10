package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaDAO extends JpaRepository<Turma, Long>{}