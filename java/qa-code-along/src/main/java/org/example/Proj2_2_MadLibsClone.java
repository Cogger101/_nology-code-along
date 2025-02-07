package org.example;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String adjective1;
    String girlName;
    String adjective2;
    String occupation;
    String nameOfPlace;
    String clothing;
    String hobby;
    String adjective3;
    String occupation2;
    String boyName;
    String manName;

    System.out.println("Enter an adjective: ");
    adjective1 = keyboard.nextLine();

        System.out.println("Enter a girl's name: ");
        girlName = keyboard.nextLine();

        System.out.println("Enter a second adjective: ");
        adjective2 = keyboard.nextLine();

        System.out.println("Enter an occupation: ");
        occupation = keyboard.nextLine();

        System.out.println("Enter a place: ");
        nameOfPlace = keyboard.nextLine();

        System.out.println("Enter a piece of clothing: ");
        clothing = keyboard.nextLine();

        System.out.println("Enter a hobby: ");
        hobby = keyboard.nextLine();

        System.out.println("Enter a third adjective:");
        adjective3 = keyboard.nextLine();

        System.out.println("Enter a second occupation: ");
        occupation2 = keyboard.nextLine();

        System.out.println("Enter a boy's name: ");
        boyName = keyboard.nextLine();

        System.out.println("Enter a man's name: ");
        manName = keyboard.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlName + " who was a " + adjective2 + " " + occupation + " in the kingdom of " + nameOfPlace + ".\n" +
                "She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boyName + " but her father, King " + manName + " forbid her from seeing him.");

    }


}
