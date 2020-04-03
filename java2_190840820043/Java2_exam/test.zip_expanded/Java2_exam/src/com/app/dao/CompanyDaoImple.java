package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Company;
import com.app.pojos.Location;

@Repository
@Transactional
public class CompanyDaoImple implements ICompnayDao {

	@Autowired
	SessionFactory sf;
	@Override
	public List<Company> getCompanyList() {
		String jpql="select c from Company c";
		return sf.getCurrentSession().createQuery(jpql, Company.class).getResultList();
	}
	@Override
	public void addCompany(Company comp) {
		sf.getCurrentSession().save(comp);
	}
	
	@Override
	public Company getCompanyLocationList(int id) {
		System.out.println("in dao "+id);
		String jpql="select c from Company c join fetch c.list where companyId = :Id";
		return sf.getCurrentSession().createQuery(jpql, Company.class).setParameter("Id", id).getSingleResult();
		
	}
	@Override
	public void addLocation(int id, Location location) {
		Company C= sf.getCurrentSession().get(Company.class, id);
		C.add(location);
	}
	

}
