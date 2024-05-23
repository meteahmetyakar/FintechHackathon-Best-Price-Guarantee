package com.ekip6.BestPriceGuarantee.dto;

import java.time.LocalDateTime;

public record FlightDTO(Long flightId, String origin, String destination, LocalDateTime departureTime) {
}