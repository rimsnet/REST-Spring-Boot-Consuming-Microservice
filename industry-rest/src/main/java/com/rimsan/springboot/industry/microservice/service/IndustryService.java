package com.rimsan.springboot.industry.microservice.service;

import com.rimsan.springboot.industry.microservice.dto.IndustryResponse;

public interface IndustryService {
    
	 public IndustryResponse getMobileByIndustryName(String industryName);
	 
}
