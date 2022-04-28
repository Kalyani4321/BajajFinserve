package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	 /*@Query("select c from Customer c where c.loginid = ?1")
	 public Customer getByUserId(int id);*/
}


