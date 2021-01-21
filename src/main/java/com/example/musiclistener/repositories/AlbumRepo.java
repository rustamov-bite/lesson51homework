package com.example.musiclistener.repositories;

import com.example.musiclistener.entities.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends MongoRepository<Album, Integer> {
}
