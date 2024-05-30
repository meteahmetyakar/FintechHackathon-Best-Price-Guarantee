package com.ekip6.BestPriceGuarantee.controller;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import com.ekip6.BestPriceGuarantee.producer.FlightStatusProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final FlightStatusProducer flightStatusProducer;

    public EventController(FlightStatusProducer flightStatusProducer) {
        this.flightStatusProducer = flightStatusProducer;
    }

    @PostMapping("/trigger-event")
    public String triggerEvent(@RequestBody FlightCompletedEvent event) {
        System.out.println("converted : " + event.getFlightId());
        flightStatusProducer.sendFlightCompletedEvent(event);
        return "Event triggered successfully!";
    }
}
