package com.einfo.spring.boot.web.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.einfo.spring.boot.web.ticket.service.TicketService;

public class TicketController {

	@Autowired
	private TicketService ticketService;

	public TicketService getTicketService() {
		return ticketService;
	}

	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	
}
