package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassDAO extends JpaRepository<Class, Long>{}