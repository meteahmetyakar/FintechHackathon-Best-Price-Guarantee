package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.dto.TicketDTO;
import com.ekip6.BestPriceGuarantee.mapper.TicketMapper;
import com.ekip6.BestPriceGuarantee.model.Ticket;
import com.ekip6.BestPriceGuarantee.repository.TicketRepository;
import com.ekip6.BestPriceGuarantee.repository.PriceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private PriceHistoryRepository priceHistoryRepository;

	public TicketDTO saveTicket(TicketDTO ticketDTO) {
		Ticket ticket = TicketMapper.INSTANCE.ticketDTOToTicket(ticketDTO);
		ticket = ticketRepository.save(ticket);
		return TicketMapper.INSTANCE.ticketToTicketDTO(ticket);
	}

}