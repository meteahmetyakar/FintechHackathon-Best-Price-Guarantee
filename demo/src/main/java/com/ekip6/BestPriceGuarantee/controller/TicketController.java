package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.dto.TicketDTO;
import com.ekip6.BestPriceGuarantee.service.CampaignService;
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

	@PostMapping
	public ResponseEntity<TicketDTO> createTicket(@RequestBody TicketDTO ticketDTO) {
		TicketDTO savedTicket = ticketService.saveTicket(ticketDTO);
		return ResponseEntity.ok(savedTicket);
	}

}
