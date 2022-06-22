package JpaDemo;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("bvs");
		emp.setPosition("faegaws");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		Employee e = em.find(Employee.class,129);
		System.out.println(e);
	}

}
