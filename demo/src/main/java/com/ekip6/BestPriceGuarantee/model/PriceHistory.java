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

	// Constructors
	public PriceHistory() {}

	public PriceHistory(Flight flight, BigDecimal price, LocalDateTime updateDate) {
		this.flight = flight;
		this.price = price;
		this.updateDate = updateDate;
	}

	// Getters
	public Long getPriceId() {
		return priceId;
	}

	public Flight getFlight() {
		return flight;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

}

