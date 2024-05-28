package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.dto.FlightDTO;
import com.ekip6.BestPriceGuarantee.model.Flight;
import com.ekip6.BestPriceGuarantee.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	private FlightService flightService;

	@PostMapping
	public ResponseEntity<FlightDTO> createFlight(@RequestBody FlightDTO flightDTO) {
		FlightDTO savedFlight = flightService.saveFlight(flightDTO);
		return ResponseEntity.ok(savedFlight);
	}
}
