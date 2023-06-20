package com.cjc.controlller;



import java.sql.Date;
import java.time.Duration;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class WelcomeController {

	@GetMapping("/event")
	public Mono<CustomerEvent> getCustomerEvent() {
		
		CustomerEvent event = new CustomerEvent("smit", new Date(2022, 9, 22));
		

		Mono<CustomerEvent> mono = Mono.just(event);

		return mono;

	}
	
	@GetMapping(value = "events", produces =MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents() {
		CustomerEvent event = new CustomerEvent("smit", new Date(2022, 9, 22));
		
		Stream<CustomerEvent> customerStream=Stream.generate(()->event);
		
		Flux<CustomerEvent> customerFlux=Flux.fromStream(customerStream);
		
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(3));
		
		Flux<Tuple2<Long,CustomerEvent>> zip = Flux.zip(interval, customerFlux);
		
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		
		return new ResponseEntity<Flux<CustomerEvent>>(fluxMap,HttpStatus.OK);
		
	}
}
