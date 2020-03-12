package com.chainsys.bookings;

public class bookingDetails {
	private String AirlineId;
	private int totTicketPrice;
	public String getAirlineId() {
		return AirlineId;
	}
	public void setAirlineId(String airlineId) {
		AirlineId = airlineId;
	}
	public int getTotTicketPrice() {
		return totTicketPrice;
	}
	public void setTotTicketPrice(int totTicketPrice) {
		this.totTicketPrice = totTicketPrice;
	}
}
