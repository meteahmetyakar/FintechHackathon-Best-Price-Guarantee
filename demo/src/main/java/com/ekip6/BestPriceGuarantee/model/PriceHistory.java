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

	public PriceHistory(Long priceId, Flight flight, BigDecimal price, LocalDateTime updateDate) {
		this.priceId = priceId;
		this.flight = flight;
		this.price = price;
		this.updateDate = updateDate;
	}

	// Getters and Setters
	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
}

