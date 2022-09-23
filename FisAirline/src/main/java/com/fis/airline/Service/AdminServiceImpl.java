package com.fis.airline.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.airline.Dao.AdminDao;
import com.fis.airline.Dao.PassengerDao;
import com.fis.airline.Entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired 
	PassengerDao dao;
	
	@Override
	public Admin addData(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	public Admin updateData(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	public String deleteData(int fl_id) {
		// TODO Auto-generated method stub
		adminDao.deleteById(fl_id);
		return "Deleted Successfully";
	}

	@Override
	public List<Admin> getAllData() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}
	
	@Override
	public String deletePassenger(int profile_id) {
		// TODO Auto-generated method stub
		dao.deleteById(profile_id);
		return "Passenger is deleted .. ";
	}

}
