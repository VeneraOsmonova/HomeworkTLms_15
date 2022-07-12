package com.company;

public class Person {
    private String name;
    private String designation;



    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }




    public String getName(){
        return name;
   }
   public String getDesignation(){
        return designation;
   }


   void setName(String name1){
        this.name = name1;
   }
   void setDesignation(String designation1){
        this.designation = designation1;
   }



    void learnWalkEat(){
        System.out.println(" Interested in different sciences, walking in the park, eat only healthy food.");
    }


    @Override
    public String toString (){
        return "Person: "+ " "+ name +" "+ designation;
    }
}
