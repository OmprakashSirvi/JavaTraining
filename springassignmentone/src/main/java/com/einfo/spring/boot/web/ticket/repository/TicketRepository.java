package com.einfo.spring.boot.web.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.spring.boot.web.ticket.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
