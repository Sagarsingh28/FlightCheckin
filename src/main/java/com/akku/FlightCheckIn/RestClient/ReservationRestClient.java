package com.akku.FlightCheckIn.RestClient;

import com.akku.FlightCheckIn.DataTransferObject.Reservation;
import com.akku.FlightCheckIn.DataTransferObject.UpdateReserved;

public interface ReservationRestClient {

	Reservation getReservedPassenger(long id);
	Reservation checkInPassenger(UpdateReserved updateReserved);
}
