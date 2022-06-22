package FirstHibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setSid(1);
		std.setSname("STUD1");
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("su");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(std);
		em.getTransaction().commit();
		Student e = em.find(Student.class,1);
		System.out.println(e);
		
		
	}
		
		
}
