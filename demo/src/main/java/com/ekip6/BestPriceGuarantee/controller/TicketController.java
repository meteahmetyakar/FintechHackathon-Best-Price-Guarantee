package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	@Autowired
	private TicketService ticketService;

	@GetMapping("/refundAmount")
	public ResponseEntity<BigDecimal> getRefundAmount(@RequestParam Long flightId, @RequestParam Long ticketId) {
		BigDecimal refundAmount = ticketService.calculateRefundAmount(flightId, ticketId);
		return ResponseEntity.ok(refundAmount);
	}
}
