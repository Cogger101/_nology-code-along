package com.nology.zoology;

import com.nology.zoology.animal.*;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.user.User;
import com.nology.zoology.zoo.Zoo;

import java.util.Random;

import static com.nology.zoology.animal.AnimalUtils.*; //importing all methods from a class

public class ZooPlayground {
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("HELLO");

//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

//        Lion simba = new Lion(nextUniqueId(), "Simba", 2, true);
//        Llama kuzco = new Llama(2, "Kuzco", 5);
//        Tiger tony = new Tiger(3, "Tony", 23);
//        Crocodile krok = new Crocodile(4, "Krok", 7);



        Zoo myZoo = new Zoo();

//        Lion randomLion = new Lion(nextUniqueId(), generateName(), generateRandomAge(), true);
//        System.out.println(randomLion.getName());
//        System.out.println(randomLion.getAge());


        //Random
        for (int i = 0; i <13; i++){
            switch (random.nextInt(4)){
                case 0:
                    myZoo.addAnimal(new Lion(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge(), true));
                    break;
                case 1:
                    myZoo.addAnimal(new Tiger(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
                    break;
                case 2:
                    myZoo.addAnimal(new Llama(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
                    break;
                case 3:
                    myZoo.addAnimal(new Crocodile(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
                    break;
            }
        }

//        for (int i = 0; i < 3; i++) {
//            myZoo.addAnimal(new Lion(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge(), true));
//        }
//
//        for (int i = 0; i < 4; i++) {
//            myZoo.addAnimal(new Tiger(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
//        }
//
//        for (int i = 0; i < 5; i++) {
//            myZoo.addAnimal(new Llama(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
//        }

        System.out.println(myZoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(myZoo);
        userCommandRunner.runCommands();

    }

}
