package com.fis.airline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	private int profile_id;
	@Column
	private String password;
	@Column
	private String f_name;
	@Column
	private String l_name;
	@Column
	private String address;
	@Column
	private String m_number;
	@Column
	private String email_id;
	
	
	public int getProfile_id() {
		return profile_id;
	}


	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getM_number() {
		return m_number;
	}


	public void setM_number(String m_number) {
		this.m_number = m_number;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public Passenger() {
		super();
	}


	public Passenger(int profile_id, String password, String f_name, String l_name, String address, String m_number,
			String email_id) {
		super();
		this.profile_id = profile_id;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.m_number = m_number;
		this.email_id = email_id;
	}
	
	
	
	
}
