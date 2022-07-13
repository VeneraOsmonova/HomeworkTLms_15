package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(){
    }
    public Dancer(String groupName) {
        this.groupName = groupName;
    }


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }



    void dancing(){
        System.out.println("She dances ballroom dancing");
    }

    @Override
    public String toString() {
        return "Dancer groupName: " + groupName + super.toString();
    }
}
