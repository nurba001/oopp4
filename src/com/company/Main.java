package com.company;


public class Main {

    public static void main(String[] args){

        Singer singer=new Singer("Tony Will","singer","big time rash");
        System.out.println(singer.toString());
        System.out.println(singer.singing());
        System.out.println(singer.playgitary());
        System.out.println(singer.learn("Konservatoria")+'\n'+singer.walk()+'\n'+singer.eat());

        Programmist prog=new Programmist("Bill Gais","Programmist","Googil");
        System.out.println(prog.toString());
        System.out.println(prog.learn("KGTU")+'\n'+prog.walk()+'\n'+prog.eat());

        Danser danser=new Danser("Sofia Stail","Dencing","HouseFree");
        System.out.println(danser.toString()+danser.dance());
        System.out.println(danser.learn("Iskustvo ")+'\n'+danser.walk()+'\n'+danser.eat());

    }

}
