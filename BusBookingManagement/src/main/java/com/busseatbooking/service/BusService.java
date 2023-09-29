package com.busseatbooking.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busseatbooking.entity.Bus;
import com.busseatbooking.repository.BusRepository;

@Service
public class BusService {
	
	@Autowired
	private BusRepository busRepository;
	
	//get all bus controller
	
	public List<Bus> getAllBus(){
		List<Bus> list= (List<Bus>)busRepository.findAll();
		return list;
	}
	
	// get buses by id
	
	public Bus getBusById(int id) {
		Bus bus= null;
		bus=this.busRepository.findById(id);
		return bus;
	}
	
	// Add bus 
	
	public Bus addBus(Bus b) {
		Bus result = busRepository.save(b);
		return result;
	}
	
	// Delete bus by id
	
	public void deleteBus(int bId) {
		busRepository.deleteById(bId);
	}

}
