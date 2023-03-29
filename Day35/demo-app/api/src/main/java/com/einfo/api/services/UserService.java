package com.einfo.api.services;

import com.einfo.api.model.User;

public interface UserService {
	User registerUser(User user);

	Boolean loginUser(String email, String password);
}
