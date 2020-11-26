package com.akku.FlightCheckIn.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akku.FlightCheckIn.DataTransferObject.Reservation;
import com.akku.FlightCheckIn.DataTransferObject.UpdateReserved;
import com.akku.FlightCheckIn.RestClient.ReservationRestClient;

@Controller
public class CheckInController {

	@Autowired
	private ReservationRestClient reservationRestClient;
	
	@GetMapping("/")
	public String homePage() {
		return "homePage";
	}
	
	@GetMapping("/checkIn")
	public String checkIn() {
		return "checkInPage";
	}
	
	@PostMapping("/passengerData")
	public String passengerData(@RequestParam("id")long id,Model model) {
		Reservation reserved = reservationRestClient.getReservedPassenger(id);
		model.addAttribute("reserved", reserved);
		return "passengerDataPage";
	}
	
	@PostMapping("/checkInConfirmed")
	public String checkInConfirmed(@RequestParam("id")long id ,@RequestParam("noOfBags")int noOfBags) {
		UpdateReserved updateReserved = new UpdateReserved();
		updateReserved.setId(id);
		updateReserved.setCheckedIn(true);
		updateReserved.setNoOfBags(noOfBags);
		reservationRestClient.checkInPassenger(updateReserved);
		return "checkInConfirmedPage";
	}
}
