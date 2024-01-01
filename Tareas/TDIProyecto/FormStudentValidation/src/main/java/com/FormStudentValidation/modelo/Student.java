package com.FormStudentValidation.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "first_Name")
	private String first_Name;
 
	@Column(name = "last_Name")
	private String last_Name;

	@Column(name = "sex")
	private String sex;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "section")
	private String section;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "first_Attempt")
	private Boolean first_Attempt;
	
	@Column(name = "subjects")
	private String subjects;
	
	public Student(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getFirst_Attempt() {
		return first_Attempt;
	}

	public void setFirst_Attempt(Boolean first_Attempt) {
		this.first_Attempt = first_Attempt;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	
}
