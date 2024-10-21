package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Enity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	#################################################################  JPQL ##############################################################################
	############################################  how to get All data from database using JPQL ####################################################################### 
	@Query("select s.studId,s.studFee,s.name from Student s")
	public List<String> getStudents();
// this query return string type 

	###############################################  How to get single record in database ##########################################################################
		
	@Query("select s.studId,s.name,s.studFee from Student s where s.studId = :id")
	public String getStudentById(@Param("id") Integer id);

########################################################################### Native Query #########################################################################
	
	@Query(value = "select * from student_details",nativeQuery = true)
	public List<Student> getAllStudent();

	@Query(value = "select stud_id,name,stud_fee from student_details where name = :n",nativeQuery = true)
	public List<Student> getStudentByName(@Param("n") String n);
	
  
	

}
