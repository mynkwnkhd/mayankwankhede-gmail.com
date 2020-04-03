package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Location {
	
	private Integer locationId;
	private String address,city;
	private int pincode;
	private Company cmp;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location( String address, String city, int pincode) {
		super();
		
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@ManyToOne
	public Company getCmp() {
		return cmp;
	}

	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}
	
	
	

}
