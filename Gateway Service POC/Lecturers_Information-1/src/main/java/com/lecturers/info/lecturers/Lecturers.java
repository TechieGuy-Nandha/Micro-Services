package com.lecturers.info.lecturers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="lecturer_info") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecturers {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Long id ;
	@Column
    private String firstName;
	@Column
    private String lastName;
	@Column
	private String email;
	@Column
	 private long phoneNumber ;
	@Column
	private LocalDate  hireDate ;
	@Column
	private String qualification;
	@Column
	private String department;
	@Column
	private String  designation;
	@Column
	private  float salary;
	@Column
	private String statusUpdate;
	@Column
	private LocalDateTime createdAt ;
	@Column
	private LocalDateTime updatedAt;
	
}
