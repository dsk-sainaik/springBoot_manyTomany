package com.manytomany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projId;
	private String projectName;
	public int getProjId() {
		return projId;
	}
	public void setProjId(int projId) {
		this.projId = projId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
}
