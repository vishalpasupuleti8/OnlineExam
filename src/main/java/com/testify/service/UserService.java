package com.testify.service;

import java.util.List;
import com.testify.domain.UserData;

public interface UserService {
	List<UserData> getAllUserService();
	void addUserService(UserData c);
	boolean login(UserData user);
}
