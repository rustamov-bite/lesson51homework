package com.example.musiclistener.repositories;

import com.example.musiclistener.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
}
