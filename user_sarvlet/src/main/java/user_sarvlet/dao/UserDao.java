package user_sarvlet.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import user_sarvlet.dto.User;

public class UserDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("teju");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveUser(User u) {
		et.begin();
		em.persist(u);
		et.commit();
	}
	public User fetchUser(String email) {//fetch user details by email
		Query q = em.createQuery("select a from User a where email=?1");
		q.setParameter(1,email); 
		User us=(User) q.getSingleResult();
//		return(User) query.getSingleResult();
			return us;
		
	}
	public List<User> fetchAll() {
		Query q = em.createQuery("select a from User a");
			return q.getResultList();
	}
	public void deleteUser(int id) {
		User db=em.find(User.class, id);
		if(db!=null) {
			et.begin();
			em.remove(db);
			et.commit();
		}
		
	}
	public void updateUser(User u) {
		User db=em.find(User.class, u.getId());
		if(db!=null) {
			et.begin();
			em.merge(u);
			et.commit();
		}
		
	}
	public User fetchById(int id) {
		User db=em.find(User.class, id);
		if(db!=null) {
		return db;
	}else {
		return null;
	}
	}

	
}
