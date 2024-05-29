package com.ekip6.BestPriceGuarantee.producer;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlightStatusProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendFlightCompletedEvent(FlightCompletedEvent event) {
        kafkaTemplate.send("flightCompletedEvents", event.getFlightId().toString(), event);
    }
}
