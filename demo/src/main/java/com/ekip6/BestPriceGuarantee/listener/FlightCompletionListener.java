package com.ekip6.BestPriceGuarantee.listener;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import com.ekip6.BestPriceGuarantee.service.RefundProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FlightCompletionListener {

    @Autowired
    private RefundProcessingService refundProcessingService;

    @KafkaListener(topics = "flightCompletedEvents", groupId = "flight-group")
    public String onFlightCompleted(FlightCompletedEvent event) {
        refundProcessingService.processRefundForCompletedFlight(event.getFlightId());
        return "Flight Completed Event received: " + event.getFlightId();
    }

}

