package com.company;

public class Singer extends Person {
    private String bandName;
    public Singer(String namePerson, String designationPerson,String bandName) {
        super(namePerson, designationPerson);

        this.bandName=bandName;
    }

    public String singing(){
        return "styl: "+" hip-hop";
    }
    public String playgitary(){
        return "can: "+"Playgitary ";
    }

    @Override
    public String toString() {

        return '\n'+super.toString()+"Grupa: "+ bandName;
    }
}

