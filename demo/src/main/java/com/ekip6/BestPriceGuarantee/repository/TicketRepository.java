package com.ekip6.BestPriceGuarantee.repository;

import com.ekip6.BestPriceGuarantee.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	List<Ticket> findByFlightFlightId(Long flightId);
}

