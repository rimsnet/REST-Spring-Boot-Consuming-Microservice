package com.rimsan.springboot.mobile.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rimsan.springboot.mobile.microservice.model.Mobile;
import com.rimsan.springboot.mobile.microservice.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	MobileService mobileService;
	
	@GetMapping(value = "/getMobilesByIndustry/{industryName}")
	public List<Mobile> getMobile(@PathVariable String industryName) {

		List<Mobile> studentList = mobileService.getMobilesByIndustryName(industryName);
		
		return studentList;
	}
	
}
