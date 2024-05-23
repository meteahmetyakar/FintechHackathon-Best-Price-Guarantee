package com.ekip6.BestPriceGuarantee.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
public class PriceHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long priceId;

	@ManyToOne
	@JoinColumn(name = "flight_id", nullable = false)
	private Flight flight;

	private BigDecimal price;
	private LocalDateTime updateDate;

	// Getters and Setters
}

