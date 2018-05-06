package com.lwsoft.service.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRun {

	private static final Log log = LogFactory.getLog(ApplicationRun.class);

	public static void main(String[] args) {
		try {

			// 指定log4j.properties
			PropertyConfigurator.configure(ApplicationRun.class.getClassLoader().getResource("conf/log4j.properties"));
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:conf/spring/springcontext.xml");

			// System.out.println(context.getBean("aaaa"));

			context.start();

		} catch (Exception e) {
			e.printStackTrace();
			log.error("== DubboProvider context start error:"+e);

		}

		synchronized (ApplicationRun.class) {
			while (true) {
				try {
					ApplicationRun.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:", e);
				}
			}

		}
	}

}
