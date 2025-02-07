package org.example;

import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        double num1 ;
        double num2 ;
        double num3 ;
        double numberTotalAverage;

        System.out.println("Please enter three numbers? ");
        num1 = numInput.nextInt();
        num2 = numInput.nextInt();
        num3 = numInput.nextInt();
        numInput.nextLine();

        numberTotalAverage = (num1 + num2 + num3) / 3.0;


        System.out.println("The average of all your number is: " + numberTotalAverage);


    }
}
