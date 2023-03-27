package com.einfo.spring.springassignment1.ticket.entity;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Time getShowTime() {
		return showTime;
	}

	public void setShowTime(Time showTime) {
		this.showTime = showTime;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getPayementType() {
		return payementType;
	}

	public void setPayementType(String payementType) {
		this.payementType = payementType;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}

	/**
	 * @param id
	 * @param mobileNumber
	 * @param movieName
	 * @param bookingDate
	 * @param showDate
	 * @param showTime
	 * @param numberOfSeats
	 * @param seatType
	 * @param payementType
	 * @param transactionId
	 * @param status
	 * @param paidAmount
	 */
	public Ticket(int id, String mobileNumber, String movieName, Date bookingDate, Date showDate, Time showTime,
			int numberOfSeats, String seatType, String payementType, int transactionId, String status, int paidAmount) {
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
		this.seatType = seatType;
		this.payementType = payementType;
		this.transactionId = transactionId;
		this.status = status;
		this.paidAmount = paidAmount;
	}
}
