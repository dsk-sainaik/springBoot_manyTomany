package com.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.entity.Projects;
@Repository
public interface ProjectsRepo extends JpaRepository<Projects, Integer>{

}
