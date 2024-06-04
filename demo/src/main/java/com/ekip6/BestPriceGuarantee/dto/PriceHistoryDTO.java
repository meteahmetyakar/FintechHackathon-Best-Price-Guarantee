package com.ekip6.BestPriceGuarantee.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceHistoryDTO {
	private Long priceId;
	private FlightDTO flight;
	private BigDecimal price;
	private LocalDateTime updateDate;

	// Getters and Setters
	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public FlightDTO getFlight() {
		return flight;
	}

	public void setFlight(FlightDTO flight) {
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

