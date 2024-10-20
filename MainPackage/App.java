package com.example.demo;

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

		#################################################    to insert data into database. ############################################################################

		Student st = new Student();
		st.setStudName("student01");
		st.setStudFee(12000);
		repo.save(st);
		System.out.println("student add in database!!");

		Student st01 = new Student();
		st01.setStudName("student01");
		st01.setStudFee(12000);
		
		Student st02 = new Student();
		st02.setStudName("student01");
		st02.setStudFee(12000);
		
###############################################  ##### how to insert multiple students data in database.###########################################################
		
		List<Student> students = List.of(st01,st02);
		repo.saveAll(students);
		System.out.println("Students add in database!!");

############################################################ how to update data in table ###################################################################

		Optional<Student> getstudent = repo.findById(1);
		Student st = getstudent.get();
		st.setStudFee(3000);
		repo.save(st);
		System.out.println("data update in database!!");

#########################################################  how to delete single record in table.  #################################################################

		  Optional<Student> getstudent = repo.findById(5);
		  Student st = getstudent.get();
		  repo.delete(st);
		  System.out.println("data delete in database!!");

	########################################################   how to get single record in table  ######################################################################
		Optional<Student> getstudent = repo.findById(2);
		Student st = getstudent.get();
		System.out.println(st.getStudName() + " " + st.getStudFee());

	########################################################## how to get All record in table. ##########################################################################

		Iterable<Student> students = repo.findAll();
		students.forEach(e -> {
			System.out.println(e.getStudId() + " " + e.getStudName() + " " + e.getStudFee());
		});

#########################################################   how to delete All record in table. ####################################################################
		
		Iterable<Student> students = repo.findAll();
		repo.deleteAll(students);
    System.out.println("All data delete!!");

###############################################################################################################################################################

	}

}
