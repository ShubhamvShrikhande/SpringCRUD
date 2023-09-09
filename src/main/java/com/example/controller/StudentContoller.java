package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentContoller {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student stud = studentservice.saveStudent(student);
				return ResponseEntity.ok().body(stud);
	}
	

	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Student>getStudentById(@PathVariable("id")Integer id){
		Student student = ((StudentService) studentservice).getStudentById(id);
		return ResponseEntity.ok().body(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudentById(@PathVariable("id")Integer id) {
		studentservice.deleteStudentById(id);
	
	}
	@PutMapping("/update/{id}")
	/*
	 * public Student updateStudent(@RequestBody Student s,@PathVariable Integer
	 * id){ Student st = studentservice.updateStudentById(s,id); return st;
	 */
      
		public void updateStudent(@RequestBody Student student) {
		studentservice.updateStudentById(student);
		    
	}

}
