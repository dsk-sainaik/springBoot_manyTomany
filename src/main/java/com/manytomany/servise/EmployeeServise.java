package com.manytomany.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.entity.Employee;
import com.manytomany.entity.Projects;
import com.manytomany.repo.ProjectsRepo;
import com.manytomany.repo.employeeRepo;

@Service
public class EmployeeServise {
	@Autowired
	private employeeRepo employeeRepo;
	@Autowired
	private ProjectsRepo projectsRepo;

	// insert
	public Employee insertEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	// fetch
	public Employee fetchEmployee(int id) {
		return employeeRepo.findById(id).get();
	}

	// fetch all
	public List<Employee> fetcAllhEmployee() {
		return employeeRepo.findAll();
	}

	public Employee addExistingEmployeeToExistingProject(int emp_id, int projectId) {

		Employee employee = employeeRepo.findById(emp_id).get();
		Projects project = projectsRepo.findById(projectId).get();
		if (employee != null && project != null) {
			// Check if the employee is already associated with the project
			if (!employee.getProjects().contains(project)) {
				// Add the project to the employee's list of projects
				employee.getProjects().add(project);
				// Update the employee entity to reflect the new association
				employee = employeeRepo.save(employee);
			}
		}

		return employee;
	}
	
	
	
	
	
	
//delete
	public String deleteEmploye(int id) 
	{
		employeeRepo.deleteById(id);
		return "delete sucess";
	}
	
	
	
	
//update
	public Employee updateEmployee(int id, Employee employee) 
	{
		Employee emp=employeeRepo.findById(id).get();
		if(emp!=null)
		{
			emp.setEmpName(employee.getEmpName());
			emp.setProjects(employee.getProjects());
			employeeRepo.save(emp);
		}
		return emp;
		
		
	}
	
	
	

}
