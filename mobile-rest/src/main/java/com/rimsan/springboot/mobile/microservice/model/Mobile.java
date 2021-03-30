package com.rimsan.springboot.mobile.microservice.model;

public class Mobile {
	
	private String mobileName;
	private String description;
	
	public Mobile(String mobileName, String description) {
		super();
		this.mobileName = mobileName;
		this.description = description;
	}
	
	public String getMobileName() {
		return mobileName;
	}
	
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	


}
