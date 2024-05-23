package com.ekip6.BestPriceGuarantee.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceHistoryDTO(Long priceId, Long flightId, BigDecimal price, LocalDateTime updateDate) {
}
