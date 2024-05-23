package com.ekip6.BestPriceGuarantee.repository;

import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
	List<PriceHistory> findByFlightFlightIdOrderByUpdateDateDesc(Long flightId);
}
