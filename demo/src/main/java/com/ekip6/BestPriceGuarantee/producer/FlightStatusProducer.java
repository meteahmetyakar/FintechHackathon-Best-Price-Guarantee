package com.ekip6.BestPriceGuarantee.producer;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlightStatusProducer {

    private static final String TOPIC = "my_topic";
    private final KafkaTemplate<String, FlightCompletedEvent> kafkaTemplate;

    public FlightStatusProducer(KafkaTemplate<String, FlightCompletedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendFlightCompletedEvent(FlightCompletedEvent event) {
        System.out.println("Sending " + event.getFlightId() + " to kafka");
        kafkaTemplate.send("flightCompletedEvents", event);
    }
}
