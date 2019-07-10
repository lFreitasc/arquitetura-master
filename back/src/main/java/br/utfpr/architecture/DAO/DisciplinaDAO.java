package br.utfpr.architecture.DAO;

import br.utfpr.architecture.DTO.DisciplinaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaDAO extends JpaRepository<DisciplinaDTO, Long>{}