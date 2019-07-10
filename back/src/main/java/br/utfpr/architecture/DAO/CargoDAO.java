package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoDAO extends JpaRepository<Cargo, Long>{}