package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Employee;

@Component
public class EmployeeDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Transactional
	public void addEmployee(Employee emp)
	{
		hibernateTemplate.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return hibernateTemplate.loadAll(Employee.class);
	}
	
	public Employee getEmployeeById(long id) {
		
		return hibernateTemplate.get(Employee.class,id);
		
	}
	@Transactional
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
	}
	@Transactional
	public void deleteEmployee(long id) {
		
		hibernateTemplate.delete(hibernateTemplate.load(Employee.class,id));
	}

}
