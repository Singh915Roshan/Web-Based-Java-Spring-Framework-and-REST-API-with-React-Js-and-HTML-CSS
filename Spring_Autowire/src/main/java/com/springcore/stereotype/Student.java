package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component                      //for this we can use "student" name
@Component("obj")
@Scope("prototype")               //After using @Scope("prototype") we get two different HashCode for different object
//@Scope("singleton")          //its byDefault - give same memory location
public class Student {

	@Value("Ashish Balpande")
	private String studentName;
	@Value("Bengaluru")
	private String city;
	
	@Value("#{temp}")                    //used sp Expression Language
	private List<String> addresses;
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}
	
	
}
