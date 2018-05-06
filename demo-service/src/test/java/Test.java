import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lwsoft.api.service.DemoInterface;

public class Test {

	public static void main(String[] args) throws IOException {
		//指定log4j.properties
		PropertyConfigurator.configure(Test.class.getClassLoader().getResource("conf/log4j.properties"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring/springcontext.xml");
		
		DemoInterface demo = (DemoInterface)context.getBean("demoService");
		System.out.println(demo.getUser());
		
		context.start();
		
		System.in.read();
		
	}

}
