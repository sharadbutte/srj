package com.tech.clover.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.clover.Model.Admin_Flight;
import com.tech.clover.ServiceI.Admin_ServiceI;
import com.tech.clover.ServiceI.RecheduleFlight;

@RestController
@RequestMapping("/gofly-admin")
public class Admin_HomeController {
	
	@Autowired
	Admin_ServiceI adminServicei;
	
	@PostMapping("/add/flight")
    private ResponseEntity<String>	addFlight(@Valid @RequestBody Admin_Flight flight,BindingResult result)
	{
		
    	String resMessage;
    	HttpStatus httpStatus;
    	
    	if(result.hasErrors())
    	{
    		resMessage="Invalied FLight:"+result.getFieldError();
    		httpStatus=HttpStatus.BAD_REQUEST;
    		
    		return new ResponseEntity<String>(resMessage,httpStatus);
    	}
    	
    	 resMessage= adminServicei.addFlight(flight);
    	 httpStatus=HttpStatus.CREATED;
    	 
    	 return new ResponseEntity<String>(resMessage,httpStatus);
	
	
	
	    }
	
	 // @PostMapping("/add/flights")
	  @RequestMapping(value ="/add/flights" ,method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
	   private ResponseEntity<String>addFlights(@Valid @RequestBody List<Admin_Flight> flights,BindingResult result)
	   {
		   
		   String resMessage=adminServicei.addFlights(flights);
		return new ResponseEntity<String>(resMessage,HttpStatus.CREATED);
	   }
	 
	 
	 @GetMapping("/flight/get/{flightId}")
	 private ResponseEntity<Object>getFlight(@PathVariable String flightId)
	 {
		   Admin_Flight flight= adminServicei.getFlight(flightId);
		   
		   if(flightId !=null)
		   {
			   return new ResponseEntity<Object>(flight,HttpStatus.OK);
		   }
		   
		   return new ResponseEntity<Object>("Flight:"+flightId+"Dose Not exist",HttpStatus.NOT_FOUND);
	 }
	 
	 @PatchMapping("/flight/rechedule")
	 private ResponseEntity<Object>recheduleFlight(@Valid @RequestBody RecheduleFlight flightPatch,BindingResult result)
	 {
		 String resMessage;
	     HttpStatus httpStatus;
	     
	     if(result.hasErrors())
	     {
	       resMessage="Invalid Flight"+ result.getAllErrors();
	       httpStatus=HttpStatus.BAD_REQUEST;
	       return new  ResponseEntity<Object>(resMessage,httpStatus);
	     }
	     
	 Admin_Flight recheduleFlight=    adminServicei.recheduleFlight(flightPatch);
	 {
		 if(recheduleFlight!=null)
		 {
			 return new ResponseEntity<Object>(recheduleFlight,HttpStatus.OK);
		 }
	 }
	       return new ResponseEntity<Object>("Flight:"+flightPatch.getFlightId()+"Does Not Exist",HttpStatus.NOT_FOUND);
	     
	 }
	 




}
