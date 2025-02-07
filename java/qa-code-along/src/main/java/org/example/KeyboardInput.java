package org.example;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        String city;
        int age;
        double dubNum;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); //Consume the new line after an int is called.
        System.out.println("What is your fave number?");
        dubNum = keyboard.nextDouble();
        keyboard.nextLine();
        dubNum *= 2;

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " +name);
        System.out.println("age is? " + age);
        System.out.println("Your fave number doubled is? " + dubNum);
        System.out.println("The city you live in? " + city);


    }
}
