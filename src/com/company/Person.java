package com.company;

public class Person {
    private String namePerson;
    private String designationPerson;
    public Person(String namePerson,String designationPerson) {
        this.namePerson=namePerson;
        this.designationPerson=designationPerson;
    }
    public String learn(String learn){
        return " Universitet: direction "+learn;
    }
    public String walk(){
        return "walk";
    }
    public  String eat(){
        return " eat food";
    }

    @Override
    public String toString() {
        return  "Name: "+namePerson+ '\n'+"Designation: "+designationPerson+'\n';
    }
}

