package com.busseatbooking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.busseatbooking.entity.Bus;

public interface BusRepository extends CrudRepository<Bus, Integer>{
	
	public List<Bus>findAll();

	public Bus findById(int id);
}
