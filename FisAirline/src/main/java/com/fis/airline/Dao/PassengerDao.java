package com.fis.airline.Dao;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fis.airline.Entity.Admin;
import com.fis.airline.Entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{
//	@Query("select t from Admin t where t.to_location=?1 and t.from_location=?2")
//	public List<Admin> findAllFlights(String to_location,String from_location);
	
}
