package com.FormStudentValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FormStudentValidation.modelo.Materias;

public interface RepoMaterias extends JpaRepository<Materias, Integer>
{
	Materias findByAsignatura(String asignatura);
}
