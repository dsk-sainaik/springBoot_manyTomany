package com.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.entity.Employee;
@Repository
public interface employeeRepo extends JpaRepository<Employee, Integer>{

}
