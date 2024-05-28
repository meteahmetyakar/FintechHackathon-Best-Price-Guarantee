package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.model.Ticket;
import com.ekip6.BestPriceGuarantee.repository.PriceHistoryRepository;
import com.ekip6.BestPriceGuarantee.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private PriceHistoryRepository priceHistoryRepository;

	public void processRefundCampaignForFlight(Long flightId) {
		List<Ticket> tickets = ticketRepository.findByFlightFlightId(flightId);
		for (Ticket ticket : tickets) {
			BigDecimal refundAmount = calculateRefundAmount(flightId, ticket.getTicketId());
			if (refundAmount.compareTo(BigDecimal.ZERO) > 0) {
				// İade işlemi burada gerçekleştirilebilir
			}
		}
	}

	private BigDecimal calculateRefundAmount(Long flightId, Long ticketId) {
		Optional<Ticket> ticketOpt = ticketRepository.findById(ticketId);
		if (ticketOpt.isPresent()) {
			Ticket ticket = ticketOpt.get();
			if (ticket.getFlight().getFlightId().equals(flightId)) {
				BigDecimal lowestPrice = priceHistoryRepository.findLowestPriceBetweenDates(
						flightId, ticket.getPurchaseDate(), ticket.getFlight().getDepartureTime());
				return ticket.getPrice().subtract(lowestPrice);
			}
		}
		return BigDecimal.ZERO;
	}
}

