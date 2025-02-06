package org.example;

public class Dog{
    private String name;
    private int age;
    private String breed;


    public Dog(int age, String breed, String name){
//        referencing the Dog constructor containing name and age this(name,age)
        this(name, age);
        this.breed = breed;
    }

    public Dog(String name, int age){
//        this refers to the object itself
        this.name = name;
        this.age = age;
        }

Dog(String name){
    this.name = name;
    this.age = 1;
    }
}
