package com.tech.clover.ServiceI;

import java.util.List;

import com.tech.clover.Model.Admin_Flight;

public interface Admin_ServiceI 
{
   public String addFlight(Admin_Flight flight);
	
   public String addFlights(List<Admin_Flight> flights);
   
   public Admin_Flight getFlight(String flightid);
   
   public Admin_Flight  recheduleFlight(RecheduleFlight flightToRechedule);
}
