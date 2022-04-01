package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BusinessExceptionEntity;

public interface BusinessExceptionRepository extends JpaRepository<BusinessExceptionEntity, Integer>{

	//Optional<BusinessExceptionEntity> existsByuserName(String userName);

	Optional<BusinessExceptionEntity> findByuserName(String userName);

}
