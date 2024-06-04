package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.dto.FlightDTO;
import com.ekip6.BestPriceGuarantee.mapper.FlightMapper;
import com.ekip6.BestPriceGuarantee.model.Flight;
import com.ekip6.BestPriceGuarantee.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public FlightDTO saveFlight(FlightDTO flightDTO) {
		Flight flight = FlightMapper.INSTANCE.flightDTOToFlight(flightDTO);
		flight = flightRepository.save(flight);
		return FlightMapper.INSTANCE.flightToFlightDTO(flight);
	}

}


