package com.example.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

	  Optional<Address> findByLocation(String location) ;


}
