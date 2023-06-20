package com.ashokit.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.PassengerRequest;
import com.ashokit.response.TicketResponse;
import com.ashokit.service.IrctcService;

@RestController
public class IrctcRestController {

	@Autowired
	private IrctcService service;
	
	@PostMapping(value = "/bookTicket",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> bookTicket(@RequestBody PassengerRequest request){
		String pnr=service.bookTicket(request);
		String msg="Ticket Booked::"+pnr;
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
//	@GetMapping(value = "/ticket/{pnr}",
//			produces = {"application/xml","application/json"}
//			)
//	public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr){
//		TicketResponse ticket=service.getTicketByPnr(pnr);
//		return new ResponseEntity<>(ticket,HttpStatus.OK);
//	}
}
