package com.einfo.api.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.api.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
	List<User> findByEmail(String  email);
}
