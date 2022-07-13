package com.company;

public class Singer extends Person {
    private String bandName;


    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    void singing() {
        System.out.println("Sings a popular music.");
    }


    void playGit(){
        System.out.println("Plays the bass guitar.");
    }

    @Override
    public String toString() {
        return "Singer bandName:" + " "+ bandName + super.toString();
    }
}








