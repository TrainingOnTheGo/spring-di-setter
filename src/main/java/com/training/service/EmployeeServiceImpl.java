package com.training.service;

import java.util.List;

import com.training.repository.EmployeeRepository;
import com.traning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {		
		return employeeRepository.findAll();
	}
	
}
