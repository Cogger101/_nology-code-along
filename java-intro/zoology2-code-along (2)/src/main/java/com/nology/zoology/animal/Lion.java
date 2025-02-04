package com.nology.zoology.animal;

public class Lion extends Animal{

    public Lion(int id, String name, int age) {
//        super is referencing the parent class
        super(id, name, age);

    }


    @Override
    public String getInformation() {
        return String.format("Animal with ID:%d, is called %s, and is %d years old", this.id, this.name, this.age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roooaaarrrrrr!!!!");
        super.makeSound();
    }
}
