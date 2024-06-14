package com.java_backend.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_backend.backend.model.GreetingModel;
import com.java_backend.backend.repository.GreetingRepository;

// Contains service classes that implement business logic. Controllers use these services to perform operations on data.
@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public GreetingModel getGreeting(GreetingModel greetingModel) {
        System.out.println(greetingModel.toString());
        return greetingModel;
    }
}
