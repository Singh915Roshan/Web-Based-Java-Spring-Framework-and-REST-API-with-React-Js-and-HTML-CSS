package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started...!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/Config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student student = new Student(1002, "Vicky Mohije", "Wardha");
//        int r = studentDao.insert(student);
//        System.out.println("Student inserted : "+r);
        
//        Student s1 = studentDao.getStudent(1002);                              //Complete CRUD Operation
//        System.out.println("Student get : "+s1);
        
//        int student = studentDao.deleteStudent(1002);
//        System.out.println("Delete Student : "+student);
        
//      Student student = new Student(1002, "Rani Mohije", "Wardha");              //not working
//      int r = studentDao.updateStudent(student, 1002);
//      System.out.println("Student updated : "+r);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          //Complete MyDatabase Application CRUD Operation
        
        boolean go = true;
        while(go) {
        	System.out.println("Press 1: for add new Student");
        	System.out.println("Press 2: for display all Students");
        	System.out.println("Press 3: for get details of single Student");
        	System.out.println("Press 4: for delete Student");
        	System.out.println("Press 5: for update Student");
        	System.out.println("Press 6: for exit");
        	System.out.println();
        	System.out.print("=>");
        	
        	try {
				int input = Integer.parseInt(br.readLine());
				switch(input)
				{
					case 1:
						//add a new Student
						//Taking input from user
						System.out.print("Enter user Id : ");
						int uId = Integer.parseInt(br.readLine());
						System.out.print("Enter user Name : ");
						String uName = br.readLine();
						System.out.print("Enter user City : ");
						String uCity = br.readLine();
						
						//Creating Student object and setting values
						Student s = new Student();
						s.setStudentId(uId);
						s.setStudentName(uName);
						s.setStudentCity(uCity);
						
						//Saving student object to database by calling insert of studentDao
						int r = studentDao.insert(s);
						System.out.println(r+" Student added");
						System.out.println("________________________________________________________________________");
						System.out.println();
						break;
						
					case 2:
						//Display all students details
						System.out.println("________________________________________________________________________");
						List<Student> allStudents = studentDao.getAllStudent();
						
						for(Student stu : allStudents) {
							System.out.println("Id : "+stu.getStudentId());
							System.out.println("Name : "+stu.getStudentName());
							System.out.println("City : "+stu.getStudentCity());
							System.out.println("________________________________________________________________________");
						}
						System.out.println("**********************************************************************");
						break;
						
					case 3:
						//Display single student details
						System.out.print("Enter user id : ");
						int userId = Integer.parseInt(br.readLine());
						
						Student stu = studentDao.getStudent(userId);
							System.out.println("Id : "+stu.getStudentId());
							System.out.println("Name : "+stu.getStudentName());
							System.out.println("City : "+stu.getStudentCity());
							System.out.println("________________________________________________________________________");
						break;
						
					case 4:
						//Delete Student
						System.out.print("Enter user id : ");
						int id = Integer.parseInt(br.readLine());
						studentDao.deleteStudent(id);
						System.out.println("Student Deleted...");
						System.out.println("________________________________________________________________________");
						break;
  
					case 5:
						//Update Student
						System.out.print("Enter user id : ");
						int updatingId = Integer.parseInt(br.readLine());
						System.out.print("Enter user Name : ");
						String updatingName = br.readLine();
						System.out.print("Enter user City : ");
						String updatingCity = br.readLine();
						
						Student s1 = new Student();
						s1.setStudentId(updatingId);
						s1.setStudentName(updatingName);
						s1.setStudentCity(updatingCity);
						
						int sId = studentDao.updateStudent(s1);
						System.out.println(sId + " : Student Updated...");

						System.out.println("________________________________________________________________________");
						break;
						
					case 6:
						//Exit 
						go = false;
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid input try with another one..!");
				System.out.println(e.getMessage());
			}
        }
        System.out.println("Thank you for using try my application");
        System.out.println("See you soon..!!");
    }
}
