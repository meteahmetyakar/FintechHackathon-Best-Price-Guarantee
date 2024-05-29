package com.ekip6.BestPriceGuarantee.events;

public class FlightCompletedEvent {
    private Long flightId;

    public FlightCompletedEvent(Long flightId) {
        this.flightId = flightId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
}
