package com.axelor.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")        //  Servlet annotation configuration
public class Sqservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	
	{   
//		int k=0;
       
	
// Fetching the cookies	
//	Cookie cookies[]  = req.getCookies();
       
//       for (Cookie c : cookies)
//      {
//    	   if(c.getName().equals("k"))
//    		 k = Integer.parseInt(c.getValue()) ;
//       }
		
		
	
		//   HttpSession sesion = req.getSession();
		//   int k=(int) sesion.getAttribute("k");
		
//		k = k * k;
		
//		PrintWriter out = res.getWriter();
//        out.println("Result is " +k);
		
	//	System.out.println("sq called");
	}

}
