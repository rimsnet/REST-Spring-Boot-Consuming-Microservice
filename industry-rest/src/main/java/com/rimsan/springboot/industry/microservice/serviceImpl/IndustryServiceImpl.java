package com.rimsan.springboot.industry.microservice.serviceImpl;

import static java.text.MessageFormat.format;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rimsan.springboot.industry.microservice.config.IndustryServiceConfig;
import com.rimsan.springboot.industry.microservice.dto.Mobile;
import com.rimsan.springboot.industry.microservice.dto.IndustryResponse;
import com.rimsan.springboot.industry.microservice.service.IndustryService;

@Service
public class IndustryServiceImpl implements IndustryService {

	@Autowired
	IndustryServiceConfig industryServiceConfig;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ObjectMapper mapper;
	
	@SuppressWarnings("unchecked")
	@Override
	public IndustryResponse getMobileByIndustryName(String industryName) {
		
		String Url = getMobileServiceApiURL(industryName);
		
		ResponseEntity<Object> restResponse = null;
		
		List<Mobile> mobileResponse = null;
		
		IndustryResponse industryResponse = new IndustryResponse();
		
		restResponse = restTemplate.getForEntity(Url, Object.class); //get,post, put, delete methods
		
		mobileResponse = mapper.convertValue(restResponse.getBody(), ArrayList.class);
		
		industryResponse.setIndustryName(industryName);
		industryResponse.setMobilesList(mobileResponse);
		
		return industryResponse;
	}
	
	
	private String getMobileServiceApiURL(String industryName) {
		UriComponentsBuilder uriBuilder = null;

		if (!Strings.isBlank(industryName)) {
			uriBuilder = UriComponentsBuilder.fromUriString(format(industryServiceConfig.getMobileServiceUrl(), industryName));
		}

		return uriBuilder.build().encode().toUriString();

	}
	

}
