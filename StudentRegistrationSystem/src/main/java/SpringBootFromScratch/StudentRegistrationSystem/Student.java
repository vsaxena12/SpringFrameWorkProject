package SpringBootFromScratch.StudentRegistrationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	
	@Autowired
	//We didn't create the object of the class Laptop using new
	Laptop laptop;
	
	public void compile()
	{
		laptop.displayLaptop();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Hello "+name);
	}
}
