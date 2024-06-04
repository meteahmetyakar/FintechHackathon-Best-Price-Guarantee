package com.ekip6.BestPriceGuarantee.mapper;

import com.ekip6.BestPriceGuarantee.dto.FlightDTO;
import com.ekip6.BestPriceGuarantee.model.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FlightMapper {
	FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

	FlightDTO flightToFlightDTO(Flight flight);
	Flight flightDTOToFlight(FlightDTO flightDTO);
}

