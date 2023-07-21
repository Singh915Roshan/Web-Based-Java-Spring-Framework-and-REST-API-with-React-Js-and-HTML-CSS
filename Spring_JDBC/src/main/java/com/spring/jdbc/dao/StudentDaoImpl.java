package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Student;

//@Component("StudentDao")                                   	//only for using @ComponentScan(basePackages= {"com.spring.jdbc.dao"}) at JdbcConfig.ava
public class StudentDaoImpl implements StudentDao{
		
//	@Autowired												//only for using @ComponentScan(basePackages= {"com.spring.jdbc.dao"}) at JdbcConfig.ava
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		//Insert query
        String query = "insert into student (id, name, city) Values(?,?,?)";
        
        //Fire query
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return result;
	}

	public int change(Student student) {                                                   //Add update method
		// Updating Data
		String query = "update student set name=?, city=? where id=?";
		
		//Fire query
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return result;
	}

	public int delete(int studentId) {														//Add Delete method
		// Delete Data	
		String query = "delete from student where id=?";
		
		//Fire query
        int result = this.jdbcTemplate.update(query, studentId);

		return result;
	}

	public Student getStudent(int studentId) {												//get Single row method
		// get single row Data
		String query = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
//if we dont want to make separate RowMapperImpl class
//		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student = new Student();
//				
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				
//				return student;} 
//			}, studentId);
		
		return student;
	}

	public List<Student> getAllStudent() {													//get All Student method
		// Get All Student
		String query = "select * from student";
		
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
 		
		return students;
	}

}
