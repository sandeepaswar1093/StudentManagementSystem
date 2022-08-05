package com.bikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.model.Student;
import com.bikkadIt.service.ServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private ServiceI serviceI;

	@PostMapping(value = "saveAllData", consumes = "application/json",produces = "application/json")
	public ResponseEntity<Student> saveAllData(@RequestBody Student student)
	{
		Student saveAllData = serviceI.saveAllData(student);
		
		return new ResponseEntity<Student>(saveAllData, HttpStatus.OK);
		
	}
	@GetMapping(value = "getAllData" , produces = "application/json")
	public ResponseEntity<List<Student>> getAllData()
	{
		List<Student> allData = serviceI.getAllData();
		if(allData != null)
		{
			return new ResponseEntity<List<Student>>(allData,HttpStatus.OK);
		}
		
		return new ResponseEntity<List<Student>>(allData,HttpStatus.NO_CONTENT);
		
	}
	
	@GetMapping(value = "getAllByAge/{age}", produces = "application/json")
	public ResponseEntity<List<Student>> getAllByAge(@PathVariable int age)
	{
		List<Student> allByAge = serviceI.getAllByAge(age);
		
		return new ResponseEntity<List<Student>>(allByAge,HttpStatus.OK);
		
	}
}
