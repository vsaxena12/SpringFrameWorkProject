package LinkedListUsingSpring.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LinkedListApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(LinkedListApplication.class, args);
		
		LinkedList list = //applicationContext.getBean(LinkedList.class);
				new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.display();
	}

}
