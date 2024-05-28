package com.ekip6.BestPriceGuarantee.service;

import com.ekip6.BestPriceGuarantee.model.Flight;
import com.ekip6.BestPriceGuarantee.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@EnableScheduling
public class CampaignSchedulerService {

	@Autowired
	private CampaignService campaignService;

	@Autowired
	private FlightRepository flightRepository;

	// Her gün saat 01:00'de çalışacak şekilde planlanmış görev
	@Scheduled(cron = "0 0 1 * * ?")
	public void processRefundsForCompletedFlights() {
		LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
		List<Flight> completedFlights = flightRepository.findFlightsByDepartureTimeLessThan(yesterday);
		for (Flight flight : completedFlights) {
			campaignService.processRefundCampaignForFlight(flight.getFlightId());
		}
	}
}
