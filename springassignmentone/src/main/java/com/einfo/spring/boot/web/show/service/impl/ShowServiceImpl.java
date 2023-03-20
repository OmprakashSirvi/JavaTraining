package com.einfo.spring.boot.web.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfo.spring.boot.web.show.dao.ShowDao;
import com.einfo.spring.boot.web.show.entity.Show;
import com.einfo.spring.boot.web.show.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowDao showDao;

	public ShowDao getShowDao() {
		return showDao;
	}

	public void setShowDao(ShowDao showDao) {
		this.showDao = showDao;
	}

	@Override
	public Show create(Show show) {
		Show newShow = showDao.create(show);
		return newShow;
	}
}
