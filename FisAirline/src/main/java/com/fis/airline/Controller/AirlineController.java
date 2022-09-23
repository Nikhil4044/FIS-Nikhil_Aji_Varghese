package com.fis.airline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.airline.Entity.Admin;
import com.fis.airline.Entity.Passenger;
import com.fis.airline.Service.AdminService;
import com.fis.airline.Service.PassengerService;

@RequestMapping("/airline")
@RestController
public class AirlineController {
	
	@Autowired
	AdminService service;
	@Autowired
	PassengerService passservice;
	
	@GetMapping("/all")
	public List<Admin> getAll(){
		return service.getAllData();
	}
	
	@PostMapping("/add")
	public Admin addData(@RequestBody Admin admin) {
		return service.addData(admin);
	}
	
	@PutMapping("/update")
	public Admin updateData(@RequestBody Admin admin) {
		return service.updateData(admin);
				
	}
	
	@DeleteMapping("/delete/{fl_id}")
	public String deleteData(@PathVariable("fl_id")int flid) {
		return service.deleteData(flid);
	}
	
	@PostMapping("/addPassenger")
	public Passenger addPassengerData(@RequestBody Passenger pass) {
		return passservice.addPassengerData(pass);
	}
	
	@PutMapping("/updatePassenger")
	public Passenger updatePassengerData(@RequestBody Passenger pass) {
		return passservice.updatePassengerData(pass);
	}
	
	@DeleteMapping("/deletePassenger/{profile_id}")
	public String deletePassenger(@PathVariable("profile_id")int profile_id) {
		return service.deletePassenger(profile_id);
	}
	
	@GetMapping("/find/{to_location}/{from_location}")
	public List<Admin> findflights(@PathVariable("to_location") String to_location,@PathVariable("from_location") String from_location){
		return passservice.findAllFlights(to_location, from_location);
	}

}
