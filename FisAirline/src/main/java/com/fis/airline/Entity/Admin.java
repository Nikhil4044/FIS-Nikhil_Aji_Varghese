package com.fis.airline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	private int fl_id;
	@Column
	private int al_id;
	@Column
	private String al_name;
	@Column
	private String from_location;
	@Column
	private String to_location;
	@Column
	private String depart_time;
	@Column
	private String arrival_time;
	@Column
	private String duration;
	@Column
	private int total_seats;
	
	
	
	public Admin() {
		super();
	}
	
	public Admin(int fl_id, int al_id, String al_name, String from_location, String to_location, String depart_time,
			String arrival_time, String duration, int total_seats) {
		super();
		this.fl_id = fl_id;
		this.al_id = al_id;
		this.al_name = al_name;
		this.from_location = from_location;
		this.to_location = to_location;
		this.depart_time = depart_time;
		this.arrival_time = arrival_time;
		this.duration = duration;
		this.total_seats = total_seats;
	}
	public int getFl_id() {
		return fl_id;
	}
	public void setFl_id(int fl_id) {
		this.fl_id = fl_id;
	}
	public int getAl_id() {
		return al_id;
	}
	public void setAl_id(int al_id) {
		this.al_id = al_id;
	}
	public String getAl_name() {
		return al_name;
	}
	public void setAl_name(String al_name) {
		this.al_name = al_name;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public String getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(String depart_time) {
		this.depart_time = depart_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	
	

}
