package com.rimsan.springboot.industry.microservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IndustryServiceConfig {
	
	
	@Value("${mobiles.microservice.url}")
    private String mobileServiceUrl;

	public String getMobileServiceUrl() {
		return mobileServiceUrl;
	}

	public void setMobileServiceUrl(String mobileServiceUrl) {
		this.mobileServiceUrl = mobileServiceUrl;
	}
	

}
