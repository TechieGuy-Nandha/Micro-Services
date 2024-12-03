package com.students.info.sthudent;

import java.time.LocalDate;
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
@Table(name="student_info") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Long id ;
	@Column
	private long admissionNo ;
	@Column
	private long batchYear;
	@Column
	private String branchName;
	@Column
    private String firstName;
	@Column
    private String lastName;
	@Column
	private String fatherName;
	@Column
	private LocalDate  dateOfBirth ;
	@Column
	private int age;
	@Column
	private String gender;
	@Column
	private long aadharNo;
	@Column
	private long phoneNo;
	@Column
    private String email;
	@Column
	private String housenoStreet;
	@Column
	private String village;
	@Column
	private String district;
	@Column
	private String state;
	@Column
	private String country;
	
}
