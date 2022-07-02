package com.example.lessonmay07;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String occupation;
    private String location;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee( String name, String lastName, String occupation, String location) {
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.location = location;

    }
}
