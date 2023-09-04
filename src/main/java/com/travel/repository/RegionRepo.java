package com.travel.repository;

import com.travel.models.REGION;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface RegionRepo extends MongoRepository<REGION,String> {
}
