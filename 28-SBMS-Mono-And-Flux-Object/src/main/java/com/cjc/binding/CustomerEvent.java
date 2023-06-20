package com.cjc.binding;



import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerEvent {

	private String name;
	private Date eventDate;

	public CustomerEvent(String name, Date eventDate) {
		super();
		this.name = name;
		this.eventDate = eventDate;
	}

}
