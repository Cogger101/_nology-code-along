package org.example;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm: " + combined);

        combined = isRaining || isWarm;
        System.out.println("is it raining or warm: " + combined);

        combined = !isRaining;
        System.out.println("is it NOT raining outside? " + combined);

        combined = !isWarm;
        System.out.println("is it NOT warm outside? " + combined);

        combined = !isRaining && isWarm;
        System.out.println("is it NOT raining and warm outside? " + combined);

        combined = isRaining || !isWarm;

        System.out.println("is it raining or NOT warm outside? " + combined);
    }
}
