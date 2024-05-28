package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.dto.PriceHistoryDTO;
import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import com.ekip6.BestPriceGuarantee.service.PriceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priceHistories")
public class PriceHistoryController {
	@Autowired
	private PriceHistoryService priceHistoryService;

	@PostMapping
	public ResponseEntity<PriceHistoryDTO> createPriceHistory(@RequestBody PriceHistoryDTO priceHistoryDTO) {
		PriceHistoryDTO savedPriceHistory = priceHistoryService.savePriceHistory(priceHistoryDTO);
		return ResponseEntity.ok(savedPriceHistory);
	}
}

