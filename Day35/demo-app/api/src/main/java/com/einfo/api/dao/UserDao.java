package com.einfo.api.dao;

import com.einfo.api.model.User;

public interface UserDao {
	User createNewUser(User user);

	User findByEmail(String email);
}
