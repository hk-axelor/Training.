package com.axelor.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepository {
	
	

	Connection con = null;
	
	public StudentRepository()
	{
		String url = "jdbc:postgresql://localhost:5432/mydb";
		String username = "axelor";
		String password = "axelor";
		try 
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,username,password);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	
	
	// constructor with the values
	
//	List<Student> students;
//	
//	public StudentRepository()
//	{
//		students = new ArrayList<>();
//		
//		Student s1 = new Student();
//		s1.setId(101);
//		s1.setName("Harish");
//     	s1.setPoints(60);
//     	
//     	Student s2 = new Student();
//     	s2.setId(102);
//     	s2.setName("Amar");
//     	s2.setPoints(90);
//     	
//     	students.add(s1);
//     	students.add(s2);
//     	
//	}
//	
// Returning the all the values
	
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<>();
		String sql = "select * from student";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setPoints(rs.getInt(3));
				
				students.add(s);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
				return students;
	
	}
	
// Fetching one particular object
	
	public Student getStudent(int id)
	{
		String sql = "select * from student where id = " +id;
		Student s = new Student();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
			
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setPoints(rs.getInt(3));
				
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return s;
		
		
	}
	//   || CREATE ||

	public void create(Student s1) {
		String sql = "insert into student values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, s1.getId());
			st.setString(2, s1.getName());
			st.setInt(3, s1.getPoints());
			st.executeUpdate();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	 
	//  || UPDATE || - if the data is present it will update else it'll create
	
	public void update(Student s1) {
		String sql = "update student set name=?, points=? where id =? ";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, s1.getName());
			st.setInt(2, s1.getPoints());
			st.setInt(3, s1.getId());
			st.executeUpdate();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	
	}
	
	// || DELETE ||
	
	public void delete(int id) {
		String sql = "delete from  student  where id =? ";
		try
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
	
	

}
