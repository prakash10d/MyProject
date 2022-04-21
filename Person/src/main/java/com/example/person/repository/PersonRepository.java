package com.example.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{


	 Optional<Person> findByEmail(String email);


}
