package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Enity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	############################################  how to get All data from database using JPQL ####################################################################### 
	@Query("select s.studId,s.studFee,s.name from Student s")
	public List<String> getStudents();
// this query return string type 
  
	

}
