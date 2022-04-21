package com.example.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{



	Optional<Employee> findByDesignation(String designation);

	Optional<Employee> findByName(String name);



}
