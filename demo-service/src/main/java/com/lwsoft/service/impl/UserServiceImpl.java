package com.lwsoft.service.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.lwsoft.api.entity.User;
import com.lwsoft.api.entity.XmlResult;
import com.lwsoft.api.service.UserService;
import com.lwsoft.dao.UserMapper;

//这里是spring的注解
@Service("userService")
//这个是dubbo的注解（同时提供dubbo本地，和rest方式）
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.lwsoft.api.service.UserService.class,protocol={"dubbo","rest"})
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	
	@Override	
	public void testget() {
		System.out.println("test get");
		
	}

	
	@Override	
	public List<User> getAllUser() {
		return userMapper.getAlluser();
	}
	
	
	@Override
	public User getUserByAge(Integer age) {
		return userMapper.getUserByAge(age);
	}
	
	
	
	@Override	
	public XmlResult getUser() {
		List<User> list = userMapper.getAlluser();
		
		XmlResult result = new XmlResult();
		result.setObject(list);
		return result;
		
	}

	

}
