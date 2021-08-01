package net.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.model.Student;
import net.javaguides.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return this.studentRepository.findAll();
	}
	
	
}
