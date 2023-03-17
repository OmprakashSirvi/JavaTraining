package com.einfo.spring.boot.web.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.einfo.spring.boot.web.ticket.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
