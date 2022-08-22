package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@Component
@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeDAO dao;
	public void add(Employee emp)
	{
		dao.addEmployee(emp);
	}
	public List<Employee> listAll(){
		return dao.getAllEmployee();
	}
	public Employee listById(long id) {
		return dao.getEmployeeById(id);
	}
	public void update(Employee emp) {
		dao.updateEmployee(emp);
	}
	public void delete(long id) {
		dao.deleteEmployee(id);
	}

}
