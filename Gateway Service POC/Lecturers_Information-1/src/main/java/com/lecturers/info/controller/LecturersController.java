package com.lecturers.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lecturers.info.lecturers.Lecturers;
import com.lecturers.info.service.LecturersService;

@RestController
@RequestMapping("/rest")
public class LecturersController {
	@Autowired
	LecturersService lecturersService;
	
  @GetMapping("/Lecturers")
    public List<Lecturers>getAllLecturers(){
	    return lecturersService.getAllLecturers() ;	
	}
  @PostMapping("/Lecturers")
    public Lecturers createLecturers(@RequestBody Lecturers lecturers){
	    return lecturersService.createLecturers(lecturers) ;
	}
  @GetMapping("/Lecturers/{id}")
	public Lecturers getLecturersById(@PathVariable Long id){	
	    return lecturersService.getLecturersById(id) ;	
	}
  @PutMapping("/Lecturers/{id}")
	public ResponseEntity<Lecturers> updateLecturers(@PathVariable Long id,@RequestBody Lecturers lecturers){
	    return  lecturersService.updateLecturers(id , lecturers);
	}
  @DeleteMapping("/Lecturers/{id}")
	public  ResponseEntity<HttpStatus> deletLecturers(@PathVariable Long id){
		return lecturersService.deleteLecturers(id);
	}
}
