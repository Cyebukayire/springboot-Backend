package net.javaguides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.model.User;
import net.javaguides.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Peace", "Hanson", "peace@gmail.com"));  
		this.userRepository.save(new User("Kellia", "Umuhire", "kellia@gmail.com"));
		this.userRepository.save(new User("Gisa", "Fadhili", "gisa@gmail.com"));
		this.userRepository.save(new User("Sam", "Shallom", "sam@gmail.com"));


	}

}
