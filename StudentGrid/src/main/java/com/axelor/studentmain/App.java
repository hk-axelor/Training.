package com.axelor.studentmain;



import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.axelor.studentdb.Book;
import com.axelor.studentdb.StdSchool;
import com.axelor.studentdb.Student;
import com.axelor.studentdb.Subject;

public class App {
	
	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.setId(4);
        s.setName("aaa");
        
        StdSchool ss=new StdSchool();
        ss.setId(121);
        ss.setSclname("DSCE");
        
        
       Book b = new Book();
       b.setBid(151);
       b.setBname("BBB");
       
       Subject sub = new Subject();
       sub.setSubid(12344);
       sub.setSubname("Chemistry");
       
       s.setSchool(ss);
       s.setSubject(sub);
       s.setBook(b);
       
        sub.getS().add(s);
    
        ss.getS().add(s);
       b.setStud(s);
       
         
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit01");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.persist(ss);
		em.persist(b);
		em.persist(sub);
		em.getTransaction().commit();
		
	}

}
