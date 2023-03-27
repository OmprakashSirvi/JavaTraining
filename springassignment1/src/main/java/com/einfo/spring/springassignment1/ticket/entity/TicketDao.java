package com.einfo.spring.springassignment1.ticket.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Integer> {

}
