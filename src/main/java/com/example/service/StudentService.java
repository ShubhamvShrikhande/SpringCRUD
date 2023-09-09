package com.example.service;

import com.example.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	

	public Student getStudentById(Integer id);
	
	public void deleteStudentById (Integer id);

    // public Student updateStudentById(Student student);


	public Student updateStudentById(Student student);


	Student updateStudentById(Integer id);


	

	

}
