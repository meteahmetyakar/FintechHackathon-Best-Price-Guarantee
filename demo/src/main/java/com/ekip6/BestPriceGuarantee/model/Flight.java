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

	// Getters and Setters
}