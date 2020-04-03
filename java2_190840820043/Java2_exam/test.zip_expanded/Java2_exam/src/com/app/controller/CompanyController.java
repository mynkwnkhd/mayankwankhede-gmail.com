package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.ICompnayDao;
import com.app.pojos.Company;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	ICompnayDao dao;
	
	public CompanyController() {
	System.out.println("int ctor of "+getClass().getName());
	}
	
	@GetMapping("/list")
	public String getCompanylist(HttpSession hs)
	{
		System.out.println("in get comapny list");
		hs.setAttribute("company_list", dao.getCompanyList());
		return "/company/list";
	}
	
	@GetMapping("/addCompany")
	public String addCompany()
	{
		System.out.println("in get comapny list");
		return "/company/add";
	}
	
	@PostMapping("/addCompany")
	public String processCompany(@RequestParam String name,@RequestParam String desc,@RequestParam int year)
	{
		System.out.println("in get comapny list");
		dao.addCompany(new Company(name, desc, year));
		return "redirect:/company/list";
	}
	

}
