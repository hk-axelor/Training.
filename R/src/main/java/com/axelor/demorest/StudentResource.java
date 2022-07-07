package com.axelor.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	
// ||  CREATING STATIC RESOURCE AND FETCHING RESOURCE  ||
	
	
// Fetching  a single Object 
	
	
	
    //	public Student getStud()
	//	{ 
	//		System.out.println("getStudent called... ");
	//		Student s1 = new Student();
	//		s1.setName("Harish");
	//		s1.setPoints(60);
	//		
	//		return s1;
	//	}
	
	
// Fetching a multiple objects at a time	
	
	//	public List<Student> getStud()
	// { 
	// System.out.println("getStudent called... ");
	// Student s1 = new Student();
	// s1.setId(101);
	//	s1.setName("Harish");
    // 	s1.setPoints(60);
     	
    // 	Student s2 = new Student();
    // 	s2.setId(101);
    //	s2.setName("Amar");
    // 	s2.setPoints(90);
     	
    // 	List<Student> students = Arrays.asList(s1,s2);
     	
    // 	return students;
	
// || FETCHING DATA IN JSON FORMANT USING POSTMAN ||
	
	
//		@GET
//		@Path("student/{id}")
//		@Produces(MediaType.APPLICATION_JSON)
//		public Student getStudent(@PathParam("id")	int id)
//		{
//			return repo.getStudent(id);
//		}
	
//  ||  FETCHING  DATA IN XML FORMAT USING POSTMAN  ||	
	
//	@GET
//	@Path("student/{id}")
//	@Produces(MediaType.APPLICATION_XML)
//	public Student getStudent(@PathParam("id")	int id)
//	{
//		return repo.getStudent(id);
//	}
	
//  ||  FETCHING DATA IN EITHER XML OR JSON FORMAT  ||

//	@GET
//	@Path("student/{id}")
//	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//	public Student getStudent(@PathParam("id")	int id)
//	{
//		return repo.getStudent(id);
//	}


	
	StudentRepository repo = new StudentRepository();
	
//  || METHOD WHICH RETURNS ALL THE STUDENTS || - either in XML or JSON (content negotiation
	
	@GET  // sending GET req
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Student> getStudents()
    {
		System.out.println("getStudent called... ");
		
		return repo.getStudents();
     	
    }
	
	

	
// || CREATING NEW OBJECT ||	
	
	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student createStudent(Student s1)
	{
		System.out.println(s1);
		repo.create(s1);
		
		 
		return s1;
	}
	
// || UPDATING OBJECT ||
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student updateStudent(Student s1)
	{
		System.out.println(s1);
		if(repo.getStudent(s1.getId()).getId()==0)
		{
		   repo.create(s1);	
			
		}
		else
		{
			repo.update(s1);
		}
		return s1;
	}

	
// || DELETE STUDENT ||
	
	@DELETE
	@Path("student/{id}")
     public Student killStudent(@PathParam("id") int id)
     {
		
    	 Student s =repo.getStudent(id);
    	 if (s.getId()!=0)
    	 repo.delete(id);
    	 
    	 
    	 return s;
    	 
     }


	
	
}
