package com.einfo.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);
}
