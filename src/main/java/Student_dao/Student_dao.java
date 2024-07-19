package Student_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import STUDENT_ENTITY.Student;

public class Student_dao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction n=em.getTransaction();
	
	
	public void save_student(Student s)
	{
		n.begin();
		em.persist(s);
		
		n.commit();
		
	}

	public List<Student> view_all_students()
	{
		
	Query  q=em.createQuery("select s from Student s");
	
	      List <Student>l= q.getResultList();
	      
	      return l;
	}
	
	public void delete_studentbyid(int id)
	{
		
	Student s=	em.find(Student.class, id);
		
		n.begin();
		
		em.remove(s);
		n.commit();
		
	}
	
	public Student find_by_id(int id)
	{
	Student s=	em.find(Student.class, id);
	
	return s;
		
	}
	
	public void updatestudent(Student s)
	{
       n.begin();
		
		em.merge(s);
		n.commit();
	}
	
}
