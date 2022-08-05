package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.model.Student;

public interface ServiceI {
	
	public Student saveAllData(Student student);
	
	public List<Student> getAllData();
	
	public List<Student> getAllByAge(int age);

}
