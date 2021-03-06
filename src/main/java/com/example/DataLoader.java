package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	private final EmployeeRepository repository;
	
	public DataLoader(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		this.repository.save(new Employee("Lucas",62, 10));		
	}
}
