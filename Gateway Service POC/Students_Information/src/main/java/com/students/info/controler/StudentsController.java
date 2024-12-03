package com.students.info.controler;

import java.util.List;

import com.students.info.sthudent.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.students.info.service.StudentsService;
import com.students.info.sthudent.Students;


@RestController
@RequestMapping("/rest")
public class StudentsController {
		@Autowired
		StudentsService studentsService;
	  @GetMapping("/getAllStudents")
	    public List<Students>getAllStudents(){
		    return studentsService.getAllStudents() ;	
		}
	  @PostMapping("/students")
	    public Students createStudents(@RequestBody Students students){
		    return studentsService.createStudents(students) ;
		}
	  @GetMapping("/students/{id}")
		public Students getStudentsById(@PathVariable Long id){	
		    return studentsService.getStudentsById(id) ;	
		}
	  @PutMapping("/students/{id}")
		public ResponseEntity<Students> updateStudents(@PathVariable Long id,@RequestBody Students students){
		    return  studentsService.updateStudents(id , students);
		}
	  @DeleteMapping("/students/{id}")
		public  ResponseEntity<HttpStatus> deletStudents(@PathVariable Long id){
			return studentsService.deleteStudents(id);
		}
	@PatchMapping(value ="/updateMaster", consumes = "application/json")
	public Master updateMaster(@RequestBody Master master){
		return studentsService.updateMaster(master) ;
	}
}


