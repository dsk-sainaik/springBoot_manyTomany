package com.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.Employee;
import com.manytomany.servise.EmployeeServise;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServise employeeServise;
	
	@PostMapping("/insertEmp")
	public Employee insert(@RequestBody Employee employee)
	{
		return employeeServise.insertEmployee(employee);
	}
	
	@GetMapping("/getEmp/{id}")
	public Employee fetchEmp(@PathVariable("id") int  id) {
		return employeeServise.fetchEmployee(id);
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> fetchAllEmp() {
		return employeeServise.fetcAllhEmployee();
	}
	
	@PostMapping("/add/{emp_id}/{projectId}")
	public Employee addExistingEmployeeToExistingProject(@PathVariable int emp_id,@PathVariable int projectId)
	{
		return employeeServise.addExistingEmployeeToExistingProject(emp_id,projectId);
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteEmploye(@PathVariable int id)
	{
		return employeeServise.deleteEmploye(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) 
	{
	   return employeeServise.updateEmployee(id,employee);
	}

}
