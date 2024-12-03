package com.hub.www.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hub.www.employee.Employee;
import com.hub.www.exception.ResoursNotFoundException;
import com.hub.www.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
  public List<Employee>getAllEmployees(){
	return employeeRepository.findAll();	
	}
  public Employee createEmployee(Employee employee){
	return employeeRepository.save(employee) ;
	}
  public Employee getEmployeeById(Long id){
	return employeeRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;	
	}
  public ResponseEntity<Employee> updateEmployee(Long id,Employee employee){
		Employee emp=employeeRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setPositionEmp(employee.getPositionEmp());
		emp.setDepartment(employee.getDepartment());
		emp.setDateOfJoining(employee.getDateOfJoining());
		emp.setEmail(employee.getEmail());
		emp.setGender(employee.getGender());
		emp.setPhoneNo(employee.getPhoneNo());
		emp.setAddress(employee.getAddress());
		emp.setCity(employee.getCity());
		emp.setState(employee.getState());
		emp.setPostalCode(employee.getPostalCode());
		emp.setCountry(employee.getCountry());
		emp.setSalary(employee.getSalary());
		emp.setCreatedAt(employee.getCreatedAt());
		emp.setUpdatedAt(employee.getUpdatedAt());
		Employee updateEmp= employeeRepository.save(emp);
	return  ResponseEntity.ok(updateEmp);
   }
  public ResponseEntity <HttpStatus> deleteEmployee (long id){
	  Employee employee=employeeRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Employee Does Not Exist") ) ;
	  employeeRepository.delete(employee);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
}
