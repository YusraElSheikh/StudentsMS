package com.students.studentsms;

import com.students.studentsms.entity.Student;
import com.students.studentsms.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsMsApplication
//		implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(StudentsMsApplication.class, args);
	}

//	@Autowired
//	private StudentsRepository studentsRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//	}
}
