package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import com.demo.service.StudentService;


@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	StudentRepository respository;
	


	@Override
	public List<Student> getAllStudents() {
		
		return respository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	
		return respository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return respository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return respository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
	 
		  respository.deleteById(id);
		
	}
	
	  
	
	       

}

