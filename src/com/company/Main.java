package com.company;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Samat", " is a programmer.","*PeakSoft*");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("________________________");


        Dancer dancer = new Dancer("Bybysara B."," is a ballerina.","*KG_balet*");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("________________________");


        Singer singer = new Singer("Mirbek Atabekov"," is a singer.","*Atabekov*");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGit();
        System.out.println("________________________");

    }
}