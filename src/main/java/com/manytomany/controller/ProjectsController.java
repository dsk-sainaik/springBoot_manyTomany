package com.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.Projects;
import com.manytomany.servise.ProjectsServise;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ProjectsController {
	@Autowired
	private ProjectsServise projectsServise;

	@PostMapping("/insertProj")
	public Projects insertProject(@RequestBody Projects projects) {
		return projectsServise.insertEmployee(projects);
	}

	@GetMapping("/getProj/{id}")
	public Projects getById(@PathVariable("id") int id) {
		return projectsServise.fetchProjects(id);
	}

	@GetMapping("/getallprojets")
	public List<Projects> getAllProjects() {
		return projectsServise.fetchAllProjects();
	}

	@DeleteMapping("/deleteproject/{id}")
	public String deleteProject(@PathVariable int id) {
		return projectsServise.deleteProject(id);
	}
	
	@PutMapping("updateProject/{id}")
	public Projects updateProject(@PathVariable int  id, @RequestBody Projects projects) {
		return projectsServise.updateProject(id,projects);
	}

}
