package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = (companyName);
    }

    void coding() {
        System.out.println("Write code in java");
    }

    @Override
    public String toString() {
        return "companyName: " + companyName + super.toString();
    }
}
















