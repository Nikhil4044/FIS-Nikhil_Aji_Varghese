package com.fis.airline.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.airline.Dao.AdminDao;
import com.fis.airline.Dao.PassengerDao;
import com.fis.airline.Entity.Admin;
import com.fis.airline.Entity.Passenger;


@Service
public class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	PassengerDao passDao;
	
	@Autowired
	AdminDao dao;

	@Override
	public Passenger addPassengerData(Passenger passenger) {
		// TODO Auto-generated method stub
		return passDao.save(passenger);
	}

	@Override
	public Passenger updatePassengerData(Passenger passenger) {
		// TODO Auto-generated method stub
		return passDao.save(passenger);
	}

	@Override
	public List<Admin> findAllFlights(String to_location, String from_location) {
		// TODO Auto-generated method stub
		return dao.findAllFlights(to_location,from_location);
	}

	

	

}
