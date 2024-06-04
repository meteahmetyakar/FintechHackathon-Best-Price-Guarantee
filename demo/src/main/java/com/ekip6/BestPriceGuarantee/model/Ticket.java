package com.ekip6.BestPriceGuarantee.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketId;

	@ManyToOne
	@JoinColumn(name = "flight_id", nullable = false)
	private Flight flight;

	private String passengerName;
	private String seatNumber;
	private BigDecimal price;
	private LocalDateTime purchaseDate;

	// Constructors
	public Ticket() {}

	public Ticket(Flight flight, String passengerName, String seatNumber, BigDecimal price, LocalDateTime purchaseDate) {
		this.flight = flight;
		this.passengerName = passengerName;
		this.seatNumber = seatNumber;
		this.price = price;
		this.purchaseDate = purchaseDate;
	}

	// Getters
	public Long getTicketId() {
		return ticketId;
	}

	public Flight getFlight() {
		return flight;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	// Setters
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}

