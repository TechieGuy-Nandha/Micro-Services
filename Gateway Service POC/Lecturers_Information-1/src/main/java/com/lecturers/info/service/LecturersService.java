package com.lecturers.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lecturers.info.exception.LecturersException;
import com.lecturers.info.lecturers.Lecturers;
import com.lecturers.info.repository.LecturersRepository;


@Service
public class LecturersService {
	@Autowired
	LecturersRepository lecturersRepository;
  public List<Lecturers>getAllLecturers(){
	return lecturersRepository.findAll();	
	}
  public Lecturers createLecturers(Lecturers students){
	return lecturersRepository.save(students) ;
	}
  public Lecturers getLecturersById(Long id){
	return lecturersRepository.findById(id).orElseThrow(()-> new LecturersException("Id Not Found ") ) ;	
	}
  public ResponseEntity<Lecturers>updateLecturers(Long id,Lecturers lecturers){
	  Lecturers ltu= lecturersRepository.findById(id).orElseThrow(()-> new LecturersException("Id Not Found ") ) ;
	  ltu.setFirstName(lecturers.getFirstName());
		ltu.setLastName(lecturers.getLastName());
		ltu.setEmail(lecturers.getEmail());
		ltu.setPhoneNumber(lecturers.getPhoneNumber());
		ltu.setHireDate(lecturers.getHireDate());
		ltu.setQualification(lecturers.getQualification());
		ltu.setDepartment(lecturers.getDepartment());
		ltu.setDesignation(lecturers.getDesignation());
		ltu.setStatusUpdate(lecturers.getStatusUpdate());
		ltu.setSalary(lecturers.getSalary());
		ltu.setCreatedAt(lecturers.getCreatedAt());
		ltu.setUpdatedAt(lecturers.getUpdatedAt());
		Lecturers updateltu= lecturersRepository.save(ltu);
	return  ResponseEntity.ok(updateltu);
   }
  public ResponseEntity <HttpStatus> deleteLecturers (long id){
	  Lecturers lecturers= lecturersRepository.findById(id).orElseThrow(()-> new LecturersException("Employee Does Not Exist") ) ;
	  lecturersRepository.delete(lecturers);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
}


