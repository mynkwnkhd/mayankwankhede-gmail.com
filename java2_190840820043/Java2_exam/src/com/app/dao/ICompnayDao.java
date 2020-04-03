package com.app.dao;

import java.util.List;

import com.app.pojos.Company;
import com.app.pojos.Location;

public interface ICompnayDao {

	List<Company> getCompanyList();
	void addCompany(Company comp);
	
	Company getCompanyLocationList(int id);
	void addLocation(int id, Location location);
}
