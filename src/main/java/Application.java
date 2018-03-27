import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.service.EmployeeService;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.findAll().get(0).getFirstName());
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
