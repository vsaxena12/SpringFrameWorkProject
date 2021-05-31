package SpringBootFromScratch.StudentRegistrationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

@SpringBootApplication
public class StudentRegistrationSystemApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext 
				= SpringApplication.run(StudentRegistrationSystemApplication.class, args);
		
		//Laptop lappy = applicationContext.getBean(Laptop.class);
		//lappy.displayLaptop();
		
		Student student = applicationContext.getBean(Student.class);
		student.setName("Varun!!");
		student.display();
		student.compile();
		
	}

}
