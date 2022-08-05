package com.bikkadIt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByAge(int age);
}
