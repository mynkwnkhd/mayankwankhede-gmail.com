package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	private Integer companyId;
	private String cname,cdescription;
	private int estYear;
	private List<Location> list = new ArrayList<>();


	public Company() {
		// TODO Auto-generated constructor stub
	}


	public Company(String cname, String cdescription, int estYear) {
		super();
		this.cname = cname;
		this.cdescription = cdescription;
		this.estYear = estYear;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCdescription() {
		return cdescription;
	}


	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}


	public int getEstYear() {
		return estYear;
	}


	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}
	
	@OneToMany(mappedBy = "cmp",cascade = CascadeType.ALL)
	public List<Location> getList() {
		return list;
	}


	public void setList(List<Location> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", cname=" + cname + ", cdescription=" + cdescription + ", estYear="
				+ estYear + "]";
	}
	
	public void add(Location l)
	{
		list.add(l);
		l.setCmp(this);
	}

}
