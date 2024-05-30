package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.events.FlightCompletedEvent;
import com.ekip6.BestPriceGuarantee.producer.FlightStatusProducer;

import java.time.LocalDateTime;

public class FlightStatusService {
   /* private FlightStatusProducer producer;

    public FlightStatusService() {
        this.producer = new FlightStatusProducer();
    }

    public void checkAndNotifyFlightCompletion(Long flightId, LocalDateTime scheduledArrival) {
        // Uçuş durumunu kontrol etme işlemleri
        if (LocalDateTime.now().isAfter(scheduledArrival)) {
            // Uçuş tamamlandığında
            FlightCompletedEvent event = new FlightCompletedEvent(flightId);
            producer.sendFlightCompletedEvent(event);
        }
    }*/
}
