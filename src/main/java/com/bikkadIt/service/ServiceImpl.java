package com.bikkadIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.model.Student;
import com.bikkadIt.repository.StudentRepository;

@Service
public class ServiceImpl implements ServiceI{
 
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveAllData(Student student) {
		
		Student save = studentRepository.save(student);
		
		return save;
	}

	@Override
	public List<Student> getAllData() {
		List<Student> findAll = studentRepository.findAll();
		
		return findAll;
	}

	@Override
	public List<Student> getAllByAge(int age) {
		List<Student> findByAge = studentRepository.findByAge(age);
		return findByAge;
	}

	

}
