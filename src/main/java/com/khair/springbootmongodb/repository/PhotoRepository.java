package com.khair.springbootmongodb.repository;

import com.khair.springbootmongodb.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
