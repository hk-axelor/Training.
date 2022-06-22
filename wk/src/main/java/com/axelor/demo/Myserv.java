package com.axelor.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addUser")   // Servlet annotation configuration
public class Myserv extends HttpServlet{
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
//  public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
// Servlet Filter		
		PrintWriter out = response.getWriter();
		int uid = Integer.parseInt(request.getParameter("uid"));
		String uname = request.getParameter("uname");
		
		
		out.println("welcome " + uname);
		
		
		
		
		
		
		
//		List<Student> studs = Arrays.asList(new Student(1,"harish"),new Student(2,"Sanju"),new Student(3,"Sachin"));
		
		
		
//		request.setAttribute("students", studs);
//		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
//		rd.forward(request, response);
		
//  ServletContext	//
		
	//	PrintWriter out = response.getWriter();
	//	out.print("Hi  ");

	//	ServletContext ctx = getServletContext();
	//	String str = ctx.getInitParameter("name");
	//	out.println(str);

// ServletConfig //
		
		// PrintWriter out = response.getWriter();
		//	out.print("Hi  ");

		//	ServletConfig cg = getServletConfig();
		//	String str = cg.getInitParameter("name");
		//	out.println(str);
		
		
		
		
		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
	
//		int k=i+j;
		
//		PrintWriter out = res.getWriter();
//		out.println("<html><body bgcolor='cyan'>");
//		out.println("Output : " +k);
//		out.println("</body></html>");
		
// Cookie //
		
        //		Cookie cookie = new Cookie("k", k +"");
        //	     res.addCookie(cookie);
// SendRedirect
		
	//	res.sendRedirect("sq");     // URL REWRITING

		
		
// Session	//
		
	//	HttpSession session = req.getSession();
	//	session.setAttribute("k", k);
		

		
	   
		
	
//Session managment //
		
	//	req.setAttribute("k",k);
		
		
		
		
		
//Request Dispatcher //
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		

		
	}

}
