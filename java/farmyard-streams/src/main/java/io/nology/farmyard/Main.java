package io.nology.farmyard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static FarmYard farmYard = new FarmYard();
    static List<Animal> animals = new ArrayList<>(farmYard.getAnimals());
    static FarmYardChallenge farmChallenge = new FarmYardChallenge();

    public static void main(String[] args) {
////        How to print out each animal
//        for (Animal animal:animals){
//            System.out.println(animal);
//        }
////        How would we sort the animals by name?
//        animals.sort(new SortByAnimalName());
//        System.out.println("After sorting");
//        for  (Animal animal: animals){
//            System.out.println(animal);
//        }


        animals.forEach(animal -> {
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
        });

        animals.sort((a, b) -> a.getAge() - b.getAge());
        System.out.println("After sorting by age");
        animals.forEach(System.out::println);

//        System.out.println(farmChallenge.getCowCount());
//        System.out.println(farmChallenge.getAnimalCountForType());
    }

}
