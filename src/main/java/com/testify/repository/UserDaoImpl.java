package com.testify.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.testify.domain.UserData;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<UserData> getAllUsers() {
		Query q= em.createNamedQuery("selectUserData",UserData.class);
		List<UserData> users=  q.getResultList();
		return users;
	}
	
	@Override
	public void addNewUser(UserData c) {
		
		em.persist(c);
	}
	
	@Override
	public boolean login(UserData user) {
		UserData u = em.find(UserData.class, user.getEmail());
		if(user.getEmail().equals(u.getEmail()) && user.getPassword().equals(u.getPassword()))
			return true;
		else
			return false;
	}
}
