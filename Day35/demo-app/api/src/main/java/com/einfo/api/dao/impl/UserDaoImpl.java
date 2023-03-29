package com.einfo.api.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.einfo.api.dao.UserDao;
import com.einfo.api.model.User;
import com.einfo.api.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Component
@AllArgsConstructor
@Getter
public class UserDaoImpl implements UserDao {
	
	private final UserRepository userRepository;

	@Override
	public User createNewUser(User user) {
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public User findByEmail(String email) {
		List<User> users = userRepository.findByEmail(email);
		return users.get(0);
	}

}
