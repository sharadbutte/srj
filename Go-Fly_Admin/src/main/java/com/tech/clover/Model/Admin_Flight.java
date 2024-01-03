package com.tech.clover.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin_Flight {
	@Id
	private String flightId;
	private String flightcompany;
	private String flightDepartureDate;
	private String flightDepartureTime;
	private String flightArrivalDate;
	private String flightArrivalTime;
	private String flightDestination;
	private String flightSource;
	private String flightDuration;
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightcompany() {
		return flightcompany;
	}
	public void setFlightcompany(String flightcompany) {
		this.flightcompany = flightcompany;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public String getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public String getFlightArrivalDate() {
		return flightArrivalDate;
	}
	public void setFlightArrivalDate(String flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}
	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	
}
