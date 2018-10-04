import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	static Logger log = Logger.getLogger(MainApp.class.getName());
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		log.info("Going");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		log.info(obj.getMessage());
		log.info("Exiting the program");
	}
}
