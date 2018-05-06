package com.lwsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwsoft.api.entity.User;
import com.lwsoft.api.service.DemoInterface;
import com.lwsoft.dao.UserMapper;

@Service("demoService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.lwsoft.api.service.DemoInterface.class)
public class DemoServiceImpl implements DemoInterface {
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> getUser() {
		
		return userMapper.getAlluser();
	}

	
	
	
	
	

}
