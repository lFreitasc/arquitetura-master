package br.utfpr.architecture.DAO;

import br.utfpr.architecture.DTO.DepartamentoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoDAO extends JpaRepository<DepartamentoDTO, Long>{}