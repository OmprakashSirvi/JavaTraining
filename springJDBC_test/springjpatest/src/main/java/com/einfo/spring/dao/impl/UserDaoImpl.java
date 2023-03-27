package com.einfo.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.einfo.spring.dao.UserDao;
import com.einfo.spring.model.User;
import com.einfo.spring.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Component
public class UserDaoImpl implements UserDao {

	private final UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public List<User> getUserByEmail(String email) {
		List<User> userList = userRepository.findByEmail(email);
		return userList;
	}

}
