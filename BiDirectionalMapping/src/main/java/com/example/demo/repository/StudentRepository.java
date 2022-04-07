package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.StudentEntities;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntities, Integer>{


	Optional<StudentEntities> findByStudName(String studName);


}
