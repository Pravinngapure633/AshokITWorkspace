package com.ashokit.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ashokit.response.TicketResponse;
@Repository
public class IrtctcDao {
	
	private  Map<String, TicketResponse> ticketMap=new HashMap<String, TicketResponse>();
	
	public String saveTicket(TicketResponse response) {
		
		//logic will be there to store ticket into db table
		
		ticketMap.put(response.getPnr(), response);
		
		return response.getPnr();
	}

//	public TicketResponse getTicketByPnr(String pnr) {
//		//logi will be there to get ticket from db table
//		if(ticketMap.containsKey(pnr)) {
//			return ticketMap.get(pnr);
//		}
//		return null;
//	}
}
