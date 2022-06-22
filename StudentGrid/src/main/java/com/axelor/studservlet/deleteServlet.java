package com.axelor.studservlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.studentmain.Operations;

@WebServlet("/delete")
public class deleteServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int sid = Integer.parseInt(req.getParameter("sid"));
		Operations oper = new Operations();
		int deleted=oper.deletestudent(sid);
		if(deleted == 1) {
			System.out.println("Student successfully deleted");
			res.sendRedirect("index.jsp");
		}
		else 
		{
			System.out.println("Error Deleting Student");
		}
	}
	

}
