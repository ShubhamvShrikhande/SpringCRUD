package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Repository.StudentRepository;
import com.example.model.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(Integer Id) {
		Student student = studentRepository.findById(Id);
		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id); 
	}

	@Override
	public Student updateStudentById(Integer id) {
		Student student = studentRepository.findById(id);
		return student;
	}

	@Override
	public Student updateStudentById(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

	

}
