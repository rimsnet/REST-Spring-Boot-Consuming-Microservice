package com.rimsan.springboot.industry.microservice.dto;

import java.util.List;

public class IndustryResponse {
    
	private String industryName;
	private List<Mobile> mobilesList;
	
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public List<Mobile> getMobilesList() {
		return mobilesList;
	}
	public void setMobilesList(List<Mobile> mobilesList) {
		this.mobilesList = mobilesList;
	}
	
}
