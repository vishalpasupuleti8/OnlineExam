package com.testify.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.testify.domain.UserData;
import com.testify.repository.UserDao;
@Component
@Transactional
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserDao userdao;
	
	@Override
	
	public List<UserData> getAllUserService() {
		return userdao.getAllUsers();
	}

	@Override
	public void addUserService(UserData c) {
		 userdao.addNewUser(c);
		
	}
	
	@Override
	public boolean login(UserData user) {
		// TODO Auto-generated method stub
		return userdao.login(user);
	}

}
