package com.einfo.spring.boot.web.ticket.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.einfo.spring.boot.web.ticket.dao.TicketDao;
import com.einfo.spring.boot.web.ticket.entity.Ticket;
import com.einfo.spring.boot.web.ticket.repository.TicketRepository;

@Component
public class TicketDaoImpl implements TicketDao {

	@Autowired
	private TicketRepository ticketRepository;

	public TicketRepository getTicketRepository() {
		return ticketRepository;
	}

	public void setTicketRepository(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}	

	@Override
	public Ticket create(Ticket ticket) {
		Ticket newTicket = ticketRepository.save(ticket);
		return newTicket;
	}
}
