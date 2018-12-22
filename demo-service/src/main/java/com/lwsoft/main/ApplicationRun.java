package com.lwsoft.main;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRun {

	// private static final Log log = LogFactory.getLog(ApplicationRun.class);

	private static final Logger log = LoggerFactory.getLogger(ApplicationRun.class);

	public static void main(String[] args) {
		try {

			// 指定log4j2.xml

			/*URL url = ApplicationRun.class.getClassLoader().getResource("conf/log4j2.xml");
			ConfigurationSource source = new ConfigurationSource(new FileInputStream(new File(url.getPath())), url);
			Configurator.initialize(null, source);*/

			/*
			 * LoggerContext logContext = (LoggerContext)
			 * LogManager.getContext(false); URL url =
			 * ApplicationRun.class.getClassLoader().getResource(
			 * "conf/log4j2.xml"); File conFile = new File(url.toURI());
			 * logContext.setConfigLocation(conFile.toURI());
			 * logContext.reconfigure();
			 */

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:conf/spring/springcontext.xml");

			context.start();

			log.info("{}以及{}", "张三", "李四");

		} catch (Exception e) {
			e.printStackTrace();
			log.error("== DubboProvider context start error:" + e);

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
