package com.ekip6.BestPriceGuarantee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;
	private String origin;
	private String destination;
	private LocalDateTime departureTime;

	// Constructors
	public Flight() {}

	public Flight(String origin, String destination, LocalDateTime departureTime) {
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
	}

	// Getters
	public Long getFlightId() {
		return flightId;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}


	//Setters
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
}