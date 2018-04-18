package com.lwsoft.service.main;

import java.io.IOException;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRun {

	public static void main(String[] args) throws IOException {
		// 指定log4j.properties
		PropertyConfigurator.configure(Test.class.getClassLoader().getResource("conf/log4j.properties"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:conf/spring/springcontext.xml");

		// System.out.println(context.getBean("aaaa"));

		context.start();

		System.in.read();
	}

}
