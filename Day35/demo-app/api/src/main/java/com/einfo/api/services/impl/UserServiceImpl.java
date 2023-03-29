package com.einfo.api.services.impl;

import org.springframework.stereotype.Service;

import com.einfo.api.dao.UserDao;
import com.einfo.api.model.User;
import com.einfo.api.services.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	@Override
	public User registerUser(User user) {
		User newUser = userDao.createNewUser(user);
		return newUser;
	}

	@Override
	public Boolean loginUser(String email, String password) {
		User user = userDao.findByEmail(email);
		if(user == null) return false;
		if (!user.getPassword().equals(password)) return false;
		return true;
	}

}
