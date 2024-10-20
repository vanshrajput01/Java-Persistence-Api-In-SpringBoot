package com.example.demo.Enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "your_table")
@Setter
@Getter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stud_id")
	private Integer studId;
	@Column(name = "stud_name")
	private String studName;
	@Column(name = "stud_fee")
	private Integer studFee;
	
	
	
	

}
