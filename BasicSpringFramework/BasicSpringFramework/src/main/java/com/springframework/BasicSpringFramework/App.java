package com.springframework.BasicSpringFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Driver driver = (Driver) factory.getBean("drive"); 
        driver.drive();
        
    }
}
