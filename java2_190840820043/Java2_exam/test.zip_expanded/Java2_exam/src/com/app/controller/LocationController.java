package com.app.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.ICompnayDao;
import com.app.pojos.Location;

@Controller
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	ICompnayDao dao;
	
	public LocationController() {
	System.out.println("in ctor of "+getClass().getName());
	}
	
	@GetMapping("/showLocation")
	public String getLocation(@RequestParam int Id,HttpSession hs)
	{
	
		hs.setAttribute("location_list", dao.getCompanyLocationList(Id).getList());
		System.out.println("in show locations");
		return "/location/showLocation";
	}

	
	@GetMapping("/addLocation")
	public String addLocation()
	{
		
		System.out.println("in show locations");
		return "/location/addLocation";
	}
	
	@PostMapping("/addLocation")
	public String processLocation(@RequestParam String addr,@RequestParam String city,@RequestParam int pin,Model map,@RequestParam int Id)
	{
		;
		System.out.println(Id);
		dao.addLocation(Id,new Location(addr, city, pin));
		System.out.println("in show locations");
		return "/company/list";
	}
	

}
