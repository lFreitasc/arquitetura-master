package br.utfpr.architecture.DAO;

import br.utfpr.architecture.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Long>{}