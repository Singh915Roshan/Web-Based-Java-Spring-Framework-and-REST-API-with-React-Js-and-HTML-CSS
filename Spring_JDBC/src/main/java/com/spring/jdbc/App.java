package com.spring.jdbc;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started...!" );
        
        //Spring Jdbc => JdbcTemplate    (Set Configuration File)
//        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");			//for using Config.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);		//for using JdbcConfig.java 
        
//Database Setup / Configuring JdbcTemplate to execute query
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
//        //Insert query
//        String query = "insert into student (id, name, city) Values(?,?,?)";
//        
//        //Fire query
//        int result = template.update(query, 103, "Prince Kumar", "Patna");
//        
//        System.out.println("Number of record inserted : "+result);

        
//Database Setup / Configuring JdbcTemplate to execute query - by using Interface and Dao Classes
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setId(102);
        student.setName("Kritesh");
        student.setCity("Bengaluru");
        
//        int result = studentDao.insert(student);               //for insert
//        System.out.println("Student inserted : "+result);
        
//        int result = studentDao.change(student);                //for update       //Add update method
//        System.out.println("Student updated : "+result);
        
//        int result = studentDao.delete(104);                //for delete       //Add delete method
//        System.out.println("Student deleted : "+result);
        
//        Student student1 = studentDao.getStudent(101);			//for getData       //get Single row method
//        System.out.println(student1);
        
        List<Student> students = studentDao.getAllStudent();         //for allData       //get All Student method
        for(Student stu: students) {
        	System.out.println(stu);
        }
    }
}
