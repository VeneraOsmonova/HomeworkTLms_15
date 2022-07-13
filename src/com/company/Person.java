package com.company;

public class Person {
    private String name;
    private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    void learn() {
        System.out.println("Interested in different sciences.");
    }

    void walk() {
        System.out.println("Walking in the park.");
    }

    void eat() {
        System.out.println("Eat only healthy food.");
    }

    @Override
    public String toString() {
        return "  Person: " + name + designation;
    }
}





