package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoDAO extends JpaRepository<Curso, Long>{}