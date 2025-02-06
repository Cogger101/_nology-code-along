package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat felix = new Cat("Felix");
        System.out.println(felix.name);

        Cat jeff = new Cat("jeff", 4);
        System.out.println(jeff.legs);

        Cat garfield = new Cat("Garfield", 24, "Purple", 4);
        System.out.println(garfield.name);
        System.out.println(garfield.age);
        System.out.println(garfield.colour);
        System.out.println(garfield.legs);
    }
}