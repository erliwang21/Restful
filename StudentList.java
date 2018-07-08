package com.example.demo;

public class StudentList {

    public final long id;
    public final String name;

    public StudentList(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}