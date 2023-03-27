package com.einfo.spring.dao;

import java.util.List;

import com.einfo.spring.model.User;

public interface UserDao {

	User createUser(User user);

	List<User> getUserByEmail(String email);

}
