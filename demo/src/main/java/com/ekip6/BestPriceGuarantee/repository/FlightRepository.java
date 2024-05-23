package com.ekip6.BestPriceGuarantee.repository;

import com.ekip6.BestPriceGuarantee.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
