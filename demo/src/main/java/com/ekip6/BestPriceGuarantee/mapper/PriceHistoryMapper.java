package com.ekip6.BestPriceGuarantee.mapper;

import com.ekip6.BestPriceGuarantee.dto.PriceHistoryDTO;
import com.ekip6.BestPriceGuarantee.model.PriceHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {FlightMapper.class}) // Uses FlightMapper for nested Flight objects
public interface PriceHistoryMapper {
	PriceHistoryMapper INSTANCE = Mappers.getMapper(PriceHistoryMapper.class);

	PriceHistoryDTO priceHistoryToPriceHistoryDTO(PriceHistory priceHistory);
	PriceHistory priceHistoryDTOToPriceHistory(PriceHistoryDTO priceHistoryDTO);
}