package com.springframework.BasicSpringFramework;

public class Driver 
{
	private int age;
	private Computer computer;
	
	Driver()
	{
		System.out.println("Construct Driver");
	}
	
	
	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	
	


	
	
	public void drive()
	{
		System.out.println("Driving");
		computer.codeRun();
		
	}

}
