package com.einfo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.spring.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer>{

}
