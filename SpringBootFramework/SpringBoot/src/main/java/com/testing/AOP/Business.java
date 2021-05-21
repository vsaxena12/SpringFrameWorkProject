package com.testing.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {

		@Autowired
		private DAO dao;
		
		public String calculateSomething()
		{
			return dao.retrieveSomething();
		}
		
}
