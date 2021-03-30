package com.rimsan.springboot.industry.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rimsan.springboot.industry.microservice.dto.IndustryResponse;
import com.rimsan.springboot.industry.microservice.service.IndustryService;

@RestController
public class IndustryController {
	
	
	@Autowired
	IndustryService industryService;
	
	@GetMapping(value = "/getMobileByIndustryName/{industryName}")
	public ResponseEntity<IndustryResponse> getMobiles(@PathVariable String industryName) {

		IndustryResponse industryResponse = industryService.getMobileByIndustryName(industryName);
		
		return new ResponseEntity<>(industryResponse, HttpStatus.OK);
	}
}
