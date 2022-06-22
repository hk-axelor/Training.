package com.axelor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.service.StudentService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ActionServlet extends HttpServlet{
	
  
	private static final long serialVersionUID = 4937635442283251910L;
    
	@Inject
	private StudentService studentService;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String studentName = request.getParameter("studentName");
    String password = request.getParameter("password");
    response.getWriter().println("Student Name : " +studentName+ " and Password : " +password+ "Status :"
    +studentService.authenticate(studentName, password));
    }
}
