package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import com.ekip6.BestPriceGuarantee.service.PriceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priceHistory")
public class PriceHistoryController {
	@Autowired
	private PriceHistoryService priceHistoryService;

	@PostMapping
	public ResponseEntity<PriceHistory> createPriceHistory(@RequestBody PriceHistory priceHistory) {
		return ResponseEntity.ok(priceHistoryService.savePriceHistory(priceHistory));
	}

	@GetMapping("/{flightId}")
	public ResponseEntity<List<PriceHistory>> getPriceHistoryByFlightId(@PathVariable Long flightId) {
		return ResponseEntity.ok(priceHistoryService.getPriceHistoryByFlightId(flightId));
	}
}

