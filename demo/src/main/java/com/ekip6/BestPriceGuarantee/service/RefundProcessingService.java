package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import com.ekip6.BestPriceGuarantee.model.Ticket;
import com.ekip6.BestPriceGuarantee.repository.PriceHistoryRepository;
import com.ekip6.BestPriceGuarantee.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RefundProcessingService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PriceHistoryRepository priceHistoryRepository;

    public void processRefundForCompletedFlight(Long flightId) {
        List<Ticket> tickets = ticketRepository.findByFlightFlightId(flightId);
        for (Ticket ticket : tickets) {
            BigDecimal refundAmount = calculateRefundAmount(ticket);
            if (refundAmount.compareTo(BigDecimal.ZERO) > 0) {
                // İade işlemi burada gerçekleştirilebilir
                // Örneğin, kullanıcıya bildirim göndermek veya iade tutarını kullanıcının hesabına iade etmek
            }
        }
    }

    private BigDecimal calculateRefundAmount(Ticket ticket) {
        BigDecimal lowestPrice = priceHistoryRepository.findLowestPriceBetweenDates(
                ticket.getFlight().getFlightId(), ticket.getPurchaseDate(), ticket.getFlight().getDepartureTime());
        return ticket.getPrice().subtract(lowestPrice);
    }
}
