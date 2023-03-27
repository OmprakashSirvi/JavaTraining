package com.einfo.spring.service;

import com.einfo.spring.model.User;

public interface UserService {
	User registerUser(User user);

	User verifyLogin(String email, String password);
}
