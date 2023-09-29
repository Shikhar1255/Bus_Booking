package com.busseatbooking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busno;
	
	@Column(name="Station")
	private String Arvtodep;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Passenger passenger;

	public Bus(int busno, String arvtodep, Passenger passenger) {
		super();
		this.busno = busno;
		Arvtodep = arvtodep;
		this.passenger = passenger;
	}
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public String getArvtodep() {
		return Arvtodep;
	}

	public void setArvtodep(String arvtodep) {
		Arvtodep = arvtodep;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", Arvtodep=" + Arvtodep + ", passenger=" + passenger + "]";
	}
	

}
