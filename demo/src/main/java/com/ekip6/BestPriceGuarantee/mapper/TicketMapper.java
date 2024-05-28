package com.ekip6.BestPriceGuarantee.mapper;

import com.ekip6.BestPriceGuarantee.dto.TicketDTO;
import com.ekip6.BestPriceGuarantee.model.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {FlightMapper.class}) // Uses FlightMapper for nested Flight objects
public interface TicketMapper {
	TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

	@Mapping(source = "flight.flightId", target = "flightId")
	TicketDTO ticketToTicketDTO(Ticket ticket);

	@Mapping(source = "flightId", target = "flight.flightId")
	Ticket ticketDTOToTicket(TicketDTO ticketDTO);
}
