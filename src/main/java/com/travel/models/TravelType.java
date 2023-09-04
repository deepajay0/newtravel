package com.travel.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travel")
public class TravelType {

    private String traveltype;

    public TravelType() {
    }

    public TravelType(String traveltype) {
        this.traveltype = traveltype;
    }

    public String getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(String traveltype) {
        this.traveltype = traveltype;
    }

    @Override
    public String toString() {
        return "TravelType{" +
                "traveltype='" + traveltype + '\'' +
                '}';
    }
}
