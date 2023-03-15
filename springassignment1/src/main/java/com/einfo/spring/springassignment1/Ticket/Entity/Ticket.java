package com.einfo.spring.springassignment1.Ticket.Entity;

import java.sql.Date;
import java.sql.Time;

public class Ticket {
	private int id;
	private String mobileNumber;
	private String movieName;
	private Date bookingDate;
	private Date showDate;
	private Time showTime;
	private int numberOfSeats;
	private String seatType;
	private String payementType;
	private int transactionId;
	private String status;
	private int paidAmount;
}
