package com.lwsoft.api.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.lwsoft.api.entity.User;
import com.lwsoft.api.entity.XmlResult;
@Path("/userService")
@Consumes({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
public interface UserService {
	
	@GET
	@Path("/testget")
	//访问路径：http://ip:port/userService/testget
	public void testget();
	
	@GET
	@Path("/getUser")
	//访问路径：http://ip:port/userService/getUser
	//xml访问路径：http://ip:port/userService/getUser.xml
	public List<User> getAllUser();
	@GET
	@Path("/getUser/{age: \\d+}")
	public User getUserByAge(@PathParam(value="age") Integer age);
	/**
	 * 这个方法有问题
	 * //json访问路径：http://ip:port/userService/getUser
	//xml访问路径：http://ip:port/userService/getUser.xml
	 */
	@GET
	@Path("/getXml")
	public XmlResult getUser();

}
