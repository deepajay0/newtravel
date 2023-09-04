package com.travel.repository;

import com.travel.models.TravelType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TravelRepo extends MongoRepository<TravelType,String> {
}
