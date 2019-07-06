package br.utfpr.architecture.DAO;

import br.utfpr.architecture.DTO.ProfessorDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorDAO extends JpaRepository<ProfessorDTO, Long>{}