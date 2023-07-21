package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;								//Adding Confi.xml, Creating entity, Creating Dao for Spring ORM Project
	
	public HibernateTemplate getHibernateTemplate() {                                 //getter-setter for hibernateTemplate
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//save student
	@Transactional												//To allow right operation -(readonly mode) by using @Transactinal
	public int insert(Student student) {
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;   
	}
	
	//Get the single data object.
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//get All student(all row)
	public List<Student> getAllStudent(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//deleteing the data
	@Transactional												//To allow right operation -(readonly mode) by using @Transactinal
	public int deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		return student.getStudentId();
	}
	
	//Updating Data
	@Transactional												//To allow right operation -(readonly mode) by using @Transactinal
	public int updateStudent(Student student) {
		this.hibernateTemplate.update(student);
		return student.getStudentId();
	}
}
