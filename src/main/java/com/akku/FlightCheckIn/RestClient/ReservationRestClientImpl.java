package com.akku.FlightCheckIn.RestClient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.akku.FlightCheckIn.DataTransferObject.Reservation;
import com.akku.FlightCheckIn.DataTransferObject.UpdateReserved;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String LOCALHOST_8081_API = "http://localhost:8081/api/reservation/";

	@Override
	public Reservation getReservedPassenger(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reserve = restTemplate.getForObject(LOCALHOST_8081_API+id, Reservation.class);
		return reserve;
	}

	@Override
	public Reservation checkInPassenger(UpdateReserved updateReserved) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reserved = restTemplate.postForObject(LOCALHOST_8081_API, updateReserved, Reservation.class);
		return reserved;
	}

}
