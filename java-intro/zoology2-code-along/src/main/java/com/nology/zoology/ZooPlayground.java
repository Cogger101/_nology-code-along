package com.nology.zoology;

import com.nology.zoology.animal.*;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.user.User;
import com.nology.zoology.zoo.Zoo;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static com.nology.zoology.animal.AnimalUtils.*; //importing all methods from a class

public class ZooPlayground {
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("HELLO");
        Scanner scanner = new Scanner(System.in);
//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

//        Lion simba = new Lion(nextUniqueId(), "Simba", 2, true);
//        Llama kuzco = new Llama(2, "Kuzco", 5);
//        Tiger tony = new Tiger(3, "Tony", 23);
//        Crocodile krok = new Crocodile(4, "Krok", 7);
        Zoo myZoo = new Zoo();

        System.out.println("Would you like to choose a number of each animal - y = Yes, n = No: \n");
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("y")){

            System.out.println("Enter the number of Lions: \n");
            int numberOfLions = scanner.nextInt();
            for (int i = 0; i < numberOfLions; i++) {
                myZoo.addAnimal(new Lion(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge(), true));
            }

            System.out.println("Enter the number of Tiger: \n");
            int numberOfTiger = scanner.nextInt();
            for (int i = 0; i < numberOfTiger; i++) {
                myZoo.addAnimal(new Tiger(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
            }

            System.out.println("Enter the number of Llama: \n");
            int numberOfLlama = scanner.nextInt();
            for (int i = 0; i < numberOfLlama; i++) {
                myZoo.addAnimal(new Llama(AnimalUtils.nextUniqueId(), generateName(), generateRandomAge()));
            }
        } else {

            System.out.println("Enter your number of animals: \n");
            int numberOfAnimals = scanner.nextInt();

            //Random
            for (int i = 0; i < numberOfAnimals; i++) {
                switch (random.nextInt(4)) {
                    case 0:
                        myZoo.addAnimal(new Lion(nextUniqueId(), generateName(), generateRandomAge(), true));
                        break;
                    case 1:
                        myZoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateRandomAge()));
                        break;
                    case 2:
                        myZoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateRandomAge()));
                        break;
                    case 3:
                        myZoo.addAnimal(new Crocodile(nextUniqueId(), generateName(), generateRandomAge()));
                        break;
                }
            }
        }
//        Lion randomLion = new Lion(nextUniqueId(), generateName(), generateRandomAge(), true);
//        System.out.println(randomLion.getName());
//        System.out.println(randomLion.getAge());

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
