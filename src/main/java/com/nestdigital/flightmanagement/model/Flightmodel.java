package com.nestdigital.flightmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flightmodel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int origin;
    private String destination;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Flightmodel() {
    }

    public Flightmodel(int id, String name, int origin, String destination, int capacity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
    }
}
