package DAO;

import java.util.List;
import DTO.Demo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Sample {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
public void addEmp(int id,String name,double sal,String jR) {
	entityTransaction.begin();
	Demo demo=new Demo();
	demo.setEmpid(id);
	demo.setName(name);
	demo.setSalary(sal);
	demo.setJobrole(jR);
	entityManager.persist(demo);
	entityTransaction.commit();
}
public void fetchEmp(int id) {
	Demo e=entityManager.find(Demo.class,id);
	if(e!=null)
		System.out.println(e);
	else
		System.out.println("data not found");
}
public void removeEmp(int id) {
	Demo e=entityManager.find(Demo.class,id);
	if(e!=null) {
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
	}
	else
		System.out.println("data not found");
	}
public void updateEmpsal(int id,double sal) {
	Demo e=entityManager.find(Demo.class,id);
	if(e!=null) {
		
		e.setSalary(sal);
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
	}else
		System.out.println("data not found");
}
public void fetchAll() {
	Query e=entityManager.createQuery("select q from demo q");
	List<Demo> w=e.getResultList();
	for(Demo f:w)
		System.out.println(f);
	}
public void deleteAll() {
	Query e=entityManager.createQuery("delete from demo");
	entityTransaction.begin();
	e.executeUpdate();
	entityTransaction.commit();
}

}
