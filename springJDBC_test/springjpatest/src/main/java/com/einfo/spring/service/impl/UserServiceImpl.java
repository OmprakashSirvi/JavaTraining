package com.einfo.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.einfo.spring.dao.UserDao;
import com.einfo.spring.model.User;
import com.einfo.spring.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	@Override
	public User registerUser(User user) {
		if (user.getFirstName() == null) return null;
		if(user.getEmail() == null) return null;
		if (user.getPassword() == null) return null;
		
		if (user.getPassword().length() < 8) return null;
		
		if (user.getUserType() == null || user.getUserType().equals(""))
			user.setUserType("user");
		
		return userDao.createUser(user);

	}

	@Override
	public User verifyLogin(String email, String password) {
		List<User> users = userDao.getUserByEmail(email);
		
		if(users.size() == 0) return null;

		for (User user : users) {
			
			if (user.getPassword().equals(password))
				return user;
			
		}
		return null;
		
	}

}
