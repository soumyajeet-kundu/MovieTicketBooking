package com.ltts.project.Dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Auditorium;
import java.util.List;

@Repository
public class AudiDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	
	public boolean InsertAudi(Auditorium a) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(a);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
//		finally {
//			sf.close();
//			em.close();
//		}
		
		return b;
	}
	
	
	/*
	 * public List<Member> getMembers(){ List }
	 */
	
	public Auditorium getAudiById(int audiId) {
		Auditorium a=new Auditorium();
		Auditorium m = (Auditorium)sf.openSession().get(Auditorium.class,audiId);
		
		
		return a;
	}
	
	
	public List<Auditorium> getAllAudis(){
		 Session session=sf.openSession();
	        session.beginTransaction();

	        List<Auditorium> li=sf.openSession().createCriteria(Auditorium.class).list();
	        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();

	        session.getTransaction().commit();
	        return li;
	}
}

