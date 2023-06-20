package com.ashokit.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.IrctcDao;
import com.ashokit.requset.PassengerRequest;
import com.ashokit.response.TicketResponse;

@Service
public class IrctcService {
	@Autowired
	private IrctcDao dao;

	public String bookTicket(PassengerRequest request) {

		// logic will be there book a ticket
		TicketResponse response = new TicketResponse();
		response.setName(request.getName());
		response.setStatus("Conformed");
		response.setCost(545.50);
		response.setFrom(request.getFrom());
		response.setTo(request.getTo());
		response.setJdate(request.getJdate());
		String pnr = UUID.randomUUID().toString();
		response.setPnr(pnr);
		dao.saveTicket(response);
		return pnr;
	}

	public TicketResponse getTicketByPnr(String pnr) {

		return dao.getTicketByPnr(pnr);
	}
	
	public String deleteTicket(String pnr) {
		return dao.deleteTicket(pnr);
	}
	
	public String updateTicket(TicketResponse response) {
		
		return dao.updateTickString(response);
	}

}
