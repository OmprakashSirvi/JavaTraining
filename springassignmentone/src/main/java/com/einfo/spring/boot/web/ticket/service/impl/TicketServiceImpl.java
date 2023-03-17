package com.einfo.spring.boot.web.ticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.einfo.spring.boot.web.ticket.dao.TicketDao;
import com.einfo.spring.boot.web.ticket.entity.Ticket;
import com.einfo.spring.boot.web.ticket.repository.TicketRepository;
import com.einfo.spring.boot.web.ticket.service.TicketService;

public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	
	
	public TicketDao getTicketDao() {
		return ticketDao;
	}
	
	
	
	
	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		Ticket newTicket = ticketDao.create(ticket);
		return newTicket;
	}







}
