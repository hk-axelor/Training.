package com.axelor.service.impl;


import com.axelor.service.StudentService;

public class StudentServiceImpl implements StudentService {

	
	public String authenticate(String studentName, String password) {
	 String status = null;
	 if(studentName.equals("test") && password.equals("test")) {
		 status = "Valid";
	 } else {
		 status = "Invalid";
	 }
	  return null;
	
	}
	
}
	
	


