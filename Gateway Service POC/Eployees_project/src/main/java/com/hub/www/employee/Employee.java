package com.hub.www.employee;
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
@Table(name="college_staff_info") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
			@Id
			@GeneratedValue(strategy =GenerationType.IDENTITY)
		    private Long id ;
			@Column
		    private String firstName;
			@Column
		    private String lastName;
			@Column
			private String  positionEmp;
			@Column
			private String department;
			@Column
			private LocalDate dateOfJoining;
			@Column
		    private String email;
			@Column
		    private String gender;
			@Column
		    private long phoneNo;
			@Column
			private String  address;
			@Column
			private String  city;
			@Column
			private String  state;
			@Column
			private long   postalCode;
			@Column
			private String  country;
			@Column
		    private float salary;
			@Column
			private LocalDateTime createdAt;
			@Column
			private LocalDateTime  updatedAt;
			
}
