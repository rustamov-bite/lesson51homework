package com.example.musiclistener.repositories;

import com.example.musiclistener.entities.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Repository for Music
@Repository
public interface MusicRepo extends MongoRepository<Music, Integer> {
}
