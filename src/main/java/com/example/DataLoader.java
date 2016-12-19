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
		this.repository.save(new Employee("Luis Amorim",62, 10));
		this.repository.save(new Employee("Adriano",63, 13));
		this.repository.save(new Employee("Regis",64, 14));
		this.repository.save(new Employee("Dayana",60,15));
		this.repository.save(new Employee("Amorim2",60,15));
		this.repository.save(new Employee("Clerton",60,15));
		
	}
}
