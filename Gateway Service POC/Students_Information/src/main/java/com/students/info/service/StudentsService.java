package com.students.info.service;

import java.util.List;
import java.util.Optional;

import com.students.info.repository.MasterRepo;
import com.students.info.sthudent.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.students.info.exception.ResoursNotFoundException;
import com.students.info.repository.StudentsRepository;
import com.students.info.sthudent.Students;

@Service
public class StudentsService {
	@Autowired
	StudentsRepository studentsRepository;
	@Autowired
	MasterRepo masterRepo;
  public List<Students>getAllStudents(){
	return studentsRepository.findAll();	
	}
  public Students createStudents(Students students){
	return studentsRepository.save(students);
	}
  public Students getStudentsById(Long id){
	return studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;	
	}
  public ResponseEntity<Students> updateStudents(Long id,Students students){
	  Students stu= studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;
	  stu.setAdmissionNo(students.getAdmissionNo());
	  stu.setFirstName(students.getFirstName());
	  stu.setLastName(students.getLastName());
	  stu.setFatherName(students.getFatherName());
	  stu.setDateOfBirth(students.getDateOfBirth());
	  stu.setAge(students.getAge());
	  stu.setGender(students.getGender());
	  stu.setPhoneNo(students.getPhoneNo());
	  stu.setEmail(students.getEmail());
	  stu.setHousenoStreet(students.getHousenoStreet());
	  stu.setVillage(students.getVillage());
	  stu.setDistrict(students.getDistrict());
	  stu.setState(students.getState());
	  stu.setCountry(students.getCountry());
		Students updateEmp= studentsRepository.save(stu);
	return  ResponseEntity.ok(updateEmp);
   }
  public ResponseEntity <HttpStatus> deleteStudents (long id){
	  Students students= studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Employee Does Not Exist") ) ;
	  studentsRepository.delete(students);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
	public Master updateMaster(Master master){
	    Optional<Master> master1 = masterRepo.findById(master.getId());
		master1.get().setVillage(master.getVillage());
		master1.get().setState(master.getState());
			return masterRepo.save(master1.get());

	}
}
