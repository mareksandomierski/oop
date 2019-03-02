package task3;

import java.util.UUID;

public class Person {

    private String name;
    private String surname;
    private String id;

    Person() {
        id = UUID.randomUUID().toString();
        System.out.println("Konstruktor bezargumentowy person.");
    }


    Person(String name, String surname) {
        this();
        System.out.println("Konstruktor z argumentami.");
        this.name = name;
        this.surname = surname;

    }

    public void eat() {

    }

    public void sleep() {

    }

    public void read() {

    }

    public void go() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
