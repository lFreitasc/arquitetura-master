package br.utfpr.architecture.DAO;

import br.utfpr.architecture.DTO.SalaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaDAO extends JpaRepository<SalaDTO, Long>{}