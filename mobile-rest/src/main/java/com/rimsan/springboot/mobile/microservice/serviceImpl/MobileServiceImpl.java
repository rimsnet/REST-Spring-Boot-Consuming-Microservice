package com.rimsan.springboot.mobile.microservice.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rimsan.springboot.mobile.microservice.model.Mobile;
import com.rimsan.springboot.mobile.microservice.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	private static Map<String, List<Mobile>> industryDB = new HashMap<String, List<Mobile>>();

	static {
		
		industryDB = new HashMap<String, List<Mobile>>();

		List<Mobile> lst = new ArrayList<Mobile>();
		Mobile mobile = new Mobile("iphone 6s", "published in 2016.");
		lst.add(mobile);
		mobile = new Mobile("iphone 10", "publised in 2017");
		lst.add(mobile);
		industryDB.put("iphone", lst);

		lst = new ArrayList<Mobile>();
		mobile = new Mobile("android one", "published in 2019");
		lst.add(mobile);
		mobile = new Mobile("kitkat", "published in 2017");
		lst.add(mobile);
		mobile = new Mobile("jellybeen", "published in 2016");
		lst.add(mobile);
		mobile = new Mobile("stawberry", "published in 2015");
		lst.add(mobile);

		industryDB.put("android", lst);

		lst = new ArrayList<Mobile>();
		mobile = new Mobile("samsung one", "published in 2000");
		lst.add(mobile);
		mobile = new Mobile("samsung two", "published in 2020");
		lst.add(mobile);
		mobile = new Mobile("samsung five", "published in 2017");
		lst.add(mobile);
		mobile = new Mobile("samsung six", "publised in 2014");
		lst.add(mobile);

		industryDB.put("samsung", lst);

	}

	@Override
	public List<Mobile> getMobilesByIndustryName(String industryName) {

		List<Mobile> mobileList = industryDB.get(industryName);

		if (mobileList == null) {
			mobileList = new ArrayList<Mobile>();
			Mobile mobile = new Mobile("Not Found", "N/A : provide correct Industry Name");
			mobileList.add(mobile);
		}

		return mobileList;
	}

}
