package com.axelor.studentmain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.studentdb.Book;
import com.axelor.studentdb.StdSchool;
import com.axelor.studentdb.Student;
import com.axelor.studentdb.Subject;

public class Operations {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit01");
    EntityManager em = emf.createEntityManager();

    
    // Insert Student
	
	
    public int insertstudent(int id, String name, int ss,int[] sub, int b) {
    	Student s  = new Student();
    	s.setId(id);
    	s.setName(name);
    	
    	System.out.println(b);
    	Book bk = em.find(Book.class, b);
    	StdSchool sl = em.find(StdSchool.class, ss);
    	
    	if(bk == null) {
    		System.out.println("Book Not Available");
    		return 0;
    	}
    	if(sl == null) {
    		System.out.println("School not available");
    		return 0;
    	}
    	s.setBook(bk);
    	s.setSchool(sl);
    	
    	for (Integer n : sub) {
    		Subject su = em.find(Subject.class, n);
    		if(su == null) {
    		       System.out.println("Subject Not Available");
    		       return 0;
    		} else
    			s.setSubject(su);
    		    su.setS(s);
    		    
    		}
    	    em.getTransaction().begin();
    	    em.persist(s);
    	    em.getTransaction().commit();
    	    
    	    return 1;
    	
    }
    
// Update Studnet
    
    public int updatestudent (int id, String name, int ss, int[] sub, int b) {
    	Student s = em.find(Student.class, id);
    	s.setName(name);
    	
    	Book bk = em.find(Book.class, b);
    	StdSchool sl = em.find(StdSchool.class, ss);
    	
    	if(bk == null) {
    		System.out.println("not available");
    		return 0;
    	}
    	if(sl == null) {
    		System.out.println ("not available");
    		return 0;
    	}
    	s.setBook(bk);
    	s.setSchool(sl);
    	
    	for (Integer n : sub) {
    		Subject su = em.find(Subject.class, n);
    	    if(su == null) {
    	    	System.out.println("not available");
    	    	return 0;
    	    	} else
    	    		s.setSubject(su);
    	}
    	
    	em.getTransaction().begin();
    	em.persist(s);
    	em.getTransaction().commit();
    	return 1;
    	
    	}
    
// Insert Subject
    
      public StdSchool insertsubject ( int subid, String subname, int[] s) {
    	  StdSchool ss = new StdSchool();
    	  ss.setId(subid);
    	  ss.setSclname(subname);
    	  for (Integer stude : s) {
    		  Student student = em.find(Student.class, stude);
    		if(student == null) {
    			System.out.println("not available");
    			break;
    		}
    		else
    			ss.getS().add(student);
    		
    	  }
    	  em.getTransaction().begin();
    	  em.persist(ss);
          em.getTransaction().commit();
          
          return ss;
          
      }
      
// Delete Student
      
      public int deletestudent (int sid) {
    	  Student s = em.find(Student.class, sid);
    	  if (s == null) {
    		System.out.println("not available");
    		return 0;
    	  }
    	  int i=0;
    	  for (Subject sub : s.getSubject()) {
    		  System.out.println(i++);
    		  System.out.println(sub.getSubname());
    		  Subject subj = em.find(Subject.class, sub.getSubid());
    		  subj.removestud(s);
    		  
    	  }
    	  em.getTransaction().begin();
    	  em.remove(s);
    	  em.getTransaction().commit();
    	  
    	  return 1;
    	  
    	  
    	  }
      
      public List<Student> ListStud()
      {
    	  List<Student> stds = em.createQuery("from Student").getResultList();
    	  
    	  return stds;
      }

      public List<Subject> ListSub()
      {
    	  List<Subject> stds = em.createQuery("from Subject").getResultList();
    	  
    	  return stds;
      }
      
}
