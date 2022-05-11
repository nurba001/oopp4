package com.company;

public class Danser extends Person{
    private String grupName;

    public Danser(String namePerson, String designationPerson,String grupName) {
        super(namePerson, designationPerson);
        this.grupName=grupName;
    }
    public String dance(){
        return  "\ntango";
    }

    @Override
    public String toString() {
        return '\n'+super.toString()+"Danser gruppa: "+grupName;
    }
}
