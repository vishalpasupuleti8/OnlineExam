package com.testify.repository;

import java.util.List;
import com.testify.domain.UserData;

public interface UserDao {
	List<UserData> getAllUsers();
	void addNewUser(UserData c);
	boolean login(UserData user);
}
