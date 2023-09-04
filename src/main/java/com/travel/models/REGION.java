package com.travel.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "REGION")
public class REGION {
    private String name;

    public REGION() {
    }

    public REGION(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
