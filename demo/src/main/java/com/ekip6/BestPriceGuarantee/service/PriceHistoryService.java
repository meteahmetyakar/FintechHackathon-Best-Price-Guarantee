package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.dto.PriceHistoryDTO;
import com.ekip6.BestPriceGuarantee.mapper.PriceHistoryMapper;
import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import com.ekip6.BestPriceGuarantee.repository.PriceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceHistoryService {
	@Autowired
	private PriceHistoryRepository priceHistoryRepository;

	public PriceHistoryDTO savePriceHistory(PriceHistoryDTO priceHistoryDTO) {
		PriceHistory priceHistory = PriceHistoryMapper.INSTANCE.priceHistoryDTOToPriceHistory(priceHistoryDTO);
		priceHistory = priceHistoryRepository.save(priceHistory);
		return PriceHistoryMapper.INSTANCE.priceHistoryToPriceHistoryDTO(priceHistory);
	}
}
