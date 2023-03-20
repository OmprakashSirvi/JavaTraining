package com.einfo.spring.boot.web.show.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.einfo.spring.boot.web.show.dao.ShowDao;
import com.einfo.spring.boot.web.show.entity.Show;
import com.einfo.spring.boot.web.show.repository.ShowRepository;

@Component
public class ShowDaoImpl implements ShowDao {

	@Autowired
	private
	ShowRepository showRepository;

	public ShowRepository getShowRepository() {
		return showRepository;
	}

	public void setShowRepository(ShowRepository showRepository) {
		this.showRepository = showRepository;
	}

	@Override
	public Show create(Show show) {
		Show newShow = showRepository.save(show);
		return newShow;
	}
	
	
}
