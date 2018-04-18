package com.lwsoft.service;

import org.springframework.stereotype.Service;

import com.lwsoft.api.entity.User;
import com.lwsoft.api.service.DemoInterface;

@Service("demoService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.lwsoft.api.service.DemoInterface.class)
public class DemoServiceImpl implements DemoInterface {

	@Override
	public User getUser() {
		
		User user = new User();
		user.setAge(7);
		user.setName("李子钰");
		
		return user;
	}
	
	
	
	

}
