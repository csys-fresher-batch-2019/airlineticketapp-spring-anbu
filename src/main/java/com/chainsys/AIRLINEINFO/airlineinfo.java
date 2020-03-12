package com.chainsys.AIRLINEINFO;

import java.time.LocalDate;
import java.util.Date;

public class airlineinfo {

	
	private String airlineid;
	public String getAirlineid() {
		return airlineid;
	}
	public void setAirlineid(String airlineid) {
		this.airlineid = airlineid;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getNoofseatsavailable() {
		return noofseatsavailable;
	}
	public void setNoofseatsavailable(int noofseatsavailable) {
		this.noofseatsavailable = noofseatsavailable;
	}
	public String getFromto() {
		return fromto;
	}
	public void setFromto(String fromto) {
		this.fromto = fromto;
	}
	public LocalDate getJourneydate() {
		return journeydate;
	}
	public void setJourneydate(LocalDate date) {
		this.journeydate = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String airlinename;
	private int totalseats;
	private int noofseatsavailable;
	private String fromto;
	private LocalDate journeydate;
	private int price;
	
	
	
	
}
