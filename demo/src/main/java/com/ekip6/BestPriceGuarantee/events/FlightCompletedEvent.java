package com.ekip6.BestPriceGuarantee.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightCompletedEvent {
    private Long flightId;

    @JsonCreator
    public FlightCompletedEvent(@JsonProperty("flightId") Long flightId) {
        this.flightId = flightId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
}
