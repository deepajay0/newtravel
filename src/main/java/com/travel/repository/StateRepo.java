package com.travel.repository;

import com.travel.models.State;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StateRepo extends MongoRepository<State,String> {
}
