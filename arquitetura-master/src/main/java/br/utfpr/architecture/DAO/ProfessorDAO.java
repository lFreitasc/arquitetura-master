package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorDAO extends JpaRepository<Professor, Long>{}