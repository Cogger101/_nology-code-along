package org.example;

public class Cat {
    String name;
    int age;
    String colour;
    int legs;

    // A constructor is a method in a class that allows us to build an object
    //    default because no arguments are passed
    Cat(){}
    Cat(String name){
        this.name = name;
    }

    Cat(String name, int legs){
        this.name = name;
        this.legs = 1;
    }

    Cat(String name, int age, String colour, int legs){
        this.name = name;
        this.age = age;
        this.colour= colour;
        this.legs = legs;
    }

    void meow(){
        System.out.println("Meow Meow");
    }
}


