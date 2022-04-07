package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.AccountEntity;
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer>{

	Optional<AccountEntity> findByaccoNo(long accoNo);


}
