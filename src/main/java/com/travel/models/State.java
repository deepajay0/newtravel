package com.travel.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "STATE")
public class State {

    private String North;

    public State() {
    }

    public State(String name) {
        this.North = name;
    }

    public String getName() {
        return North;
    }

    public void setName(String name) {
        this.North = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + North + '\'' +
                '}';
    }
}
