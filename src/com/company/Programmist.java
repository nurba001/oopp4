package com.company;

public class Programmist extends Person {
    private String companyName;
    public Programmist(String namePerson, String designationPerson,String companyName) {
        super(namePerson, designationPerson);
        this.companyName=companyName;
    }
    public String coding(){
        return "Application";
    }

    @Override
    public String toString() {
       return '\n'+ super.toString()+ "company: "+companyName;
    }
}
