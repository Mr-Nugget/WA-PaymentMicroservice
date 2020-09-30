package com.wildadventure.payment.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wildadventure.payment.models.RequestUpdateBooking;

@FeignClient(name = "booking-microservice", url="localhost:11090")
public interface IBookingProxy {
	
	@PostMapping(value= "/Booking/updatePayment")
	public Object updatePayment(@RequestBody RequestUpdateBooking request);
}
