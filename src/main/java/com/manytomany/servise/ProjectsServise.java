package com.manytomany.servise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.entity.Employee;
import com.manytomany.entity.Projects;
import com.manytomany.repo.ProjectsRepo;
import com.manytomany.repo.employeeRepo;

@Service
public class ProjectsServise {
	@Autowired
	private ProjectsRepo projectsRepo;

	// insert
	public Projects insertEmployee(Projects projects) {
		return projectsRepo.save(projects);
	}

	// fetch by id
	public Projects fetchProjects(int id) {
		return projectsRepo.findById(id).get();
	}

	// fetch all
	public List<Projects> fetchAllProjects() {
		return projectsRepo.findAll();
	}

    //delete
	public String deleteProject(int id) 
	{
		projectsRepo.deleteById(id);
		return "deleted sucessfull id "+id +"th project";
	}

	public Projects updateProject(int id, Projects projects) {
		Projects optional=projectsRepo.findById(id).get();
		if(optional!=null)
		{
			optional.setProjId(projects.getProjId());
			optional.setProjectName(projects.getProjectName());
			
		}
		return optional;
	}

}
