package com.ekip6.BestPriceGuarantee.repository;

import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
	@Query("SELECT MIN(p.price) FROM PriceHistory p WHERE p.flight.flightId = :flightId AND p.updateDate BETWEEN :start AND :end")
	BigDecimal findLowestPriceBetweenDates(Long flightId, LocalDateTime start, LocalDateTime end);
}

