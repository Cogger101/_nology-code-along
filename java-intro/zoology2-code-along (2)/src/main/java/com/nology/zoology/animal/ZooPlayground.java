package com.nology.zoology.animal;

import com.nology.zoology.zoo.Zoo;

public class ZooPlayground {

    public static void main(String[] args) {


        Lion simba = new Lion(1, "Simba", 2);


        Tiger tigger = new Tiger(2, "Tigger", 97);


        Crocodile croc = new Crocodile(3, "Gustave", 12);


        Llama max = new Llama(4, "Max", 31);



        System.out.println(simba.getInformation());
        simba.makeSound();
        System.out.println(tigger.getInformation());
        tigger.makeSound();
        System.out.println(croc.getInformation());
        croc.makeSound();
        System.out.println(max.getInformation());
        max.makeSound();

        Zoo myZoo = new Zoo();
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addTiger(tigger);
        myZoo.addLion(simba);
        myZoo.addLlama(max);
        System.out.println(myZoo.getAnimalCount());
    }

}
