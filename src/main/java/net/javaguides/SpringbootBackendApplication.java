package net.javaguides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.model.Student;
import net.javaguides.repository.StudentRepository;


@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.studentRepository.save(new Student("Peace", "A", "peace@gmail.com"));  
		this.studentRepository.save(new Student("Kellia", "B", "kellia@gmail.com"));
		this.studentRepository.save(new Student("Gisa", "B", "gisa@gmail.com"));
		this.studentRepository.save(new Student("Sam", "C", "sam@gmail.com"));

	}
	

}
