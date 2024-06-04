package com.ekip6.BestPriceGuarantee.mapper;

import com.ekip6.BestPriceGuarantee.dto.TicketDTO;
import com.ekip6.BestPriceGuarantee.model.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {FlightMapper.class}) // Uses FlightMapper for nested Flight objects
public interface TicketMapper {
	TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

	TicketDTO ticketToTicketDTO(Ticket ticket);

	Ticket ticketDTOToTicket(TicketDTO ticketDTO);
}

