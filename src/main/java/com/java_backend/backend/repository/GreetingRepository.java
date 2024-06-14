package com.java_backend.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java_backend.backend.model.GreetingModel;

// Repository: Contains repository classes that deal with data access. These classes typically use an ORM (Object-Relational Mapping) framework or JPA (Java Persistence API) to interact with the database.
@Repository
public interface GreetingRepository extends CrudRepository<GreetingModel, String>{
    // TODO: check why does not work
    // Iterable<GreetingModel> findAll(GreetingModel greetingModel);
    GreetingModel findById(int id);
    void deleteById(int id);
}
