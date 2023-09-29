package com.busseatbooking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.busseatbooking.entity.Bus;
import com.busseatbooking.service.BusService;

@RestController
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@GetMapping("/Bus")
	public List<Bus> getAllBus(){
		return busService.getAllBus();
	}
	
	@GetMapping("/Bus/{id}")
	public Bus getBus(@PathVariable("id") int id) {
		return busService.getBusById(id);
	}
	
	@PostMapping("/Bus")
	public Bus addBus(@RequestBody Bus bus) {
		Bus b=this.busService.addBus(bus);
		return bus;
	}
	
	@DeleteMapping("/Bus")
	public void deleteBus(@PathVariable("BusId") int id) {
		this.busService.deleteBus(id);
	}
	
	

}
