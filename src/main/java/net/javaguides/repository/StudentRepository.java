package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
