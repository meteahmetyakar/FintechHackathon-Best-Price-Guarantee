package com.ekip6.BestPriceGuarantee.model;

import jakarta.persistence.*;
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

	public Flight(Long flightId, String origin, String destination, LocalDateTime departureTime) {
		this.flightId = flightId;
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