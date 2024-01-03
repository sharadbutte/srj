package com.tech.clover.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.clover.Model.Admin_Flight;
import com.tech.clover.Repository.Admin_Repo;
import com.tech.clover.ServiceI.Admin_ServiceI;
import com.tech.clover.ServiceI.RecheduleFlight;


@Service
public class Admin_ServiceImpl implements Admin_ServiceI
{
	
	@Autowired
   Admin_Repo adminrepo;
	
	@Override
	public String addFlight(Admin_Flight flight)
	{
		adminrepo.save(flight);
		
		return "Flight:"+flight.getFlightId()+"Added Successfully";
	}

	@Override
	public String addFlights(List<Admin_Flight> flights) {
		
		adminrepo.saveAll(flights);
		return "All Flights are Add Successfully";
	}

	@Override
	public Admin_Flight getFlight(String flightid)
	{
	 Optional<Admin_Flight> optionalFlight= adminrepo.findById(flightid);
		
	  if(optionalFlight.isPresent())
	  {
		  return optionalFlight.get();
	  }
	 
		return null;
	}

	@Override
	public Admin_Flight recheduleFlight(RecheduleFlight flightToRechedule) 
	{
	   Optional<Admin_Flight>optionalFlight=adminrepo.findById(flightToRechedule.getFlightId());
	    if(optionalFlight.isPresent())
	    {
	    	Admin_Flight flight=optionalFlight.get();
	    	
	    	flight.setFlightArrivalDate(flightToRechedule.getFlightArrivalDate());
	    	flight.setFlightArrivalTime(flightToRechedule.getFlightArrivalTime());
	    	flight.setFlightDepartureDate(flightToRechedule.getFlightDepartureDate());
	    	flight.setFlightDepartureTime(flightToRechedule.getFlightDepartureTime());
	    	 adminrepo.save(flight);
	    	 
	    	 return flight;
	    	
	    	
	    	
	    }
		
		
		return null;
	}

}