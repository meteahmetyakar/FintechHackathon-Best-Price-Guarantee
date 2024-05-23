package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import com.ekip6.BestPriceGuarantee.repository.PriceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceHistoryService {
	@Autowired
	private PriceHistoryRepository priceHistoryRepository;

	public PriceHistory savePriceHistory(PriceHistory priceHistory) {
		return priceHistoryRepository.save(priceHistory);
	}

	public List<PriceHistory> getPriceHistoryByFlightId(Long flightId) {
		return priceHistoryRepository.findByFlightFlightIdOrderByUpdateDateDesc(flightId);
	}
}
