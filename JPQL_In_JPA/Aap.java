package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Enity.Student;

@SpringBootApplication
public class Project01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project01Application.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);

		// Here you execute JPQL Query
		 List<String> students =  repo.getStudents();
		 students.forEach(e->{
			 System.out.println(e);
		 });
		 
		 // Here how get single Record.
		 String student = repo.getStudentById(2);
		 System.out.println(student);

		List<Student> sts = repo.getAllStudent();
		 sts.forEach(e->{
			 System.out.println(e.getName() + " " + e.getStudFee());
		 });
		 
		 // get single record in data
		 List<Student> getStudent = repo.getStudentByName("stud01");
		 getStudent.forEach(e->{
			 System.out.println(e.getName() + " " + e.getStudFee());
		 });
		 
		 
		 
		

		

}


}
