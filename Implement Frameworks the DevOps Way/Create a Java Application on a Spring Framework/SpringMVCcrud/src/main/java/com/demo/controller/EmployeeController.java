package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Employee;
import com.demo.service.EmployeeServices;
import com.mysql.cj.Session;
import com.sun.net.httpserver.Request;

@Controller
@RequestMapping
public class EmployeeController {

	@Autowired
	EmployeeServices employeeServices;

	// load add employee form
	@GetMapping("addEmployee")
	public String addEmp() {

		return "AddEmployee";

	}

	// save employee form
	@PostMapping("/insertEmployee")
	public String insertEmployee(Employee emp) {

		employeeServices.add(emp);
		return "redirect:/employeeReport";
	}

	@GetMapping("employeeReport")
	public String employeeReport(Model m) {
		m.addAttribute("employee", employeeServices.listAll());
		m.addAttribute("title", "Employee Report");
		return "EmployeeReport";
	}

	@GetMapping("/editEmployee/{id}")
	public String editEmployee(@PathVariable(value = "id") long id, Model m) {
		Employee emp = employeeServices.listById(id);
		m.addAttribute("employee", emp);
		m.addAttribute("title", "Edit Employee");
		return "EditEmployee";
	}

	@PostMapping("/editEmployee/updateEmployee")
	public String updateEmployee(@ModelAttribute("updateEmployee") Employee emp) {
		employeeServices.update(emp);
		return "redirect:/employeeReport";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable long id) {
		employeeServices.delete(id);
		return "redirect:/employeeReport";
	}
	@GetMapping("searchEmployee")
	public String searchEmployee() {
		
		return "SearchEmployee";
	}
	@GetMapping("/searchingEmployee")
	public String searchingEmployee(@RequestParam("id")long id,Model m) {
		Employee emp=employeeServices.listById(id);
		if(emp==null) {
			m.addAttribute("Message", "Data Not Found");
			return "SearchResult";
		}
		m.addAttribute("employee", emp);
		m.addAttribute("Message", "Fetched Result");
		return "SearchResult";
	}
}