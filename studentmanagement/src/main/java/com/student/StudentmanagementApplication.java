package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.student.Entity.student;
import com.student.StudentRepository.StdntRepo;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Autowired
	private StdntRepo stdntRepo;
	
	@Override
	public void run(String... args) throws Exception {
		student s1=new student(1,"raja" , "a" , "ashhiak@gmail.com");
		stdntRepo.save(s1);
	}


}
