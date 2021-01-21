package com.example.musiclistener.repositories;

import com.example.musiclistener.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Repository for Author
@Repository
public interface AuthorRepo extends MongoRepository<Author, Integer> {
}
