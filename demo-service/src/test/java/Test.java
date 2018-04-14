import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//指定log4j.properties
		PropertyConfigurator.configure(Test.class.getClassLoader().getResource("conf/log4j.properties"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring/springcontext.xml");
		
		System.out.println(context.getBean("aaaa"));
		
		context.start();
		
	}

}
