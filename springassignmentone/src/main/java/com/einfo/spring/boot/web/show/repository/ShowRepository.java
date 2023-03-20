package com.einfo.spring.boot.web.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.spring.boot.web.show.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {

}
