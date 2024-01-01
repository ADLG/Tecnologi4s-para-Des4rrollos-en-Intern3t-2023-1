package com.FormStudentValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FormStudentValidation.modelo.Student;

@Repository
public interface RepoStudent extends JpaRepository<Student, Integer>
{
	Student findByemail(String email);
}
