package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n");


            //`ctl F5` =  run code

//`ctl .` = suggested fixes on highlighted code

  //          System.out.print = standard print to the console

//            System.out.printf = format print to the console

//            System.out.printIn = input print to the console

//## Java basics

//### Variables:

//            - Declaring the type of the varible first

//### Number types in Java:

//            WHOLE NUMBERS

// byte ⇒ -127 to 127 = range for a byte

            byte myByte = 127;

// short = 2 bytes ⇒ -32768 to 32767

            short myShort = 18600;

//  Int = 4 bytes ⇒ -2,147,483,648, to 2,147,483,647

            int myInt = 2_147_483_647;

// long = 8 bytes ⇒ - **-9223372036854775808 to 9223372036854775807 -** adding an L on the end confirms the longest number

            long myLong = 9_223_372_036_854_775_807L;

// char =
//            in notion intro-java docs

            // DECIMALs:

//float - 4 bytes = 6 or 7 decimal digits - adding an f on the end confirms the float number

            float myFloat = 1234567.1234567f;

//double - 8 bytes ⇒ 15 decimal digitis

            double myDouble = 127.987654321012345;

// adding myByte and myShort into a third variable  (can use either of the below)

short sum = (short) (myByte + myShort);

// int sum = myByte + myShort;

int sum2 = myShort + myShort;



//### BOOLEAN:

//  1byte ⇒ 1 or 0

            boolean myBoolean = true;
            boolean myFalse = false;

// Strings in Java

String name = "Sean";
System.out.println(name);
name += " C.";
System.out.println(name);


// How to scan for user input?


//
//        Scanner myScanner = new Scanner(System.in);
//        System.out.ptintIn("Input an Integer");
//        int userInput = myScanner.nextInt();
//        System.out.printf("User has entered %d \n", userInput);
//

//Arrays

        //limitations
        // workarounds
            int[] array = {1,2,3,4};
            System.out.printf("Index 1 in array is %d \n", array[1]);

            // using new to construct an array with the length as arg
            byte[] myByteArr = new byte[4];
            System.out.println(Arrays.toString(myByteArr));

        }
    }
