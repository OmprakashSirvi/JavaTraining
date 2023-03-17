package com.einfo.spring.boot.web.ticket.dao;

import com.einfo.spring.boot.web.ticket.entity.Ticket;

public interface TicketDao  {
	Ticket create(Ticket ticket);
}
