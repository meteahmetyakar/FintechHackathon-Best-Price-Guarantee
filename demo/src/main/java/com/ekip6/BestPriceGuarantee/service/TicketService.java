package com.ekip6.BestPriceGuarantee.service;

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

	public BigDecimal calculateRefundAmount(Long flightId, Long ticketId) {
		Optional<Ticket> ticketOpt = ticketRepository.findById(ticketId);
		if (ticketOpt.isPresent()) {
			Ticket ticket = ticketOpt.get();
			if (ticket.getFlight().getFlightId().equals(flightId)) {
				BigDecimal lowestPrice = priceHistoryRepository.findLowestPriceBetweenDates(
						flightId, ticket.getFlight().getDepartureTime(), ticket.getPurchaseDate());
				return ticket.getPrice().subtract(lowestPrice);
			}
		}
		return BigDecimal.ZERO;
	}
}