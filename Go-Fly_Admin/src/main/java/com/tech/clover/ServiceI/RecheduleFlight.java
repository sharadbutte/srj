package com.tech.clover.ServiceI;

public class RecheduleFlight {
	private String flightId;
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	//@NotBlank(message = "Flight Departure Time field missing")
	private String flightDepartureTime;
	private String flightDepartureDate;
	private String flightArrivalTime;
	private String flightArrivalDate;
	public String getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	public String getFlightArrivalDate() {
		return flightArrivalDate;
	}
	public void setFlightArrivalDate(String flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}
	
}
