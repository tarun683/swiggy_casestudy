package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.User;



@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	User findByEmail(String email);
}

