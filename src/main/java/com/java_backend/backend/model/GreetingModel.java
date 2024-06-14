package com.java_backend.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// The model folder stores data models or entities that represent structure and behaviour of the application domain. These classes are mapped to database tables and define the properties and relationships of the application data.
@Entity
@Table(name = "greeting")
public class GreetingModel {
    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonProperty(value = "Username")
    @Column(name = "username")
    String gretting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGretting() {
        return gretting;
    }

    public void setGretting(String gretting) {
        this.gretting = gretting;
    }
}
