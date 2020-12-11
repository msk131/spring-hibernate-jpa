package com.mani.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mani.api.repositories.StudentRepository;
import com.mani.api.service.StudentService;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringHibernateJpaApplication implements CommandLineRunner{

	@Autowired
	StudentRepository repository;
	
	@Autowired
	StudentService studentService;	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		studentService.addStudent();
	}	
}
