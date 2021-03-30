package com.rimsan.springboot.mobile.microservice.service;

import java.util.List;

import com.rimsan.springboot.mobile.microservice.model.Mobile;

public interface MobileService {

	public List<Mobile> getMobilesByIndustryName(String industryName);

}
