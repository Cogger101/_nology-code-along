package com.nology.zoology.animal;

import java.util.ArrayList;
import java.util.Random;

public class AnimalUtils {

    private static int nextId = 0;
    public static Random random = new Random();

    // We want to be able to use this method without have to instantiate the
    // AnimalUtils class.
    public static int nextUniqueId() {
        return ++nextId;
    }

    private static final ArrayList<String> names = new ArrayList<>();

    public static String generateName(){
        return names.get((random.nextInt(names.size())));
    }

    public static int generateRandomAge(){
        return 1 + random.nextInt(15);
    }


    static {
        names.add("Abbie");
        names.add("Alfred");
        names.add("Beth");
        names.add("Bob");
        names.add("Bonzo");
        names.add("Butch");
        names.add("Charlotte");
        names.add("Clyde");
        names.add("Ermintrude");
        names.add("Eve");
        names.add("Florence");
        names.add("Fluffy");
        names.add("Freddie");
        names.add("Grumpy");
        names.add("Holly");
        names.add("Kate");
        names.add("Knuckles");
        names.add("Lauren");
        names.add("Leo");
        names.add("Maisie");
        names.add("Max");
        names.add("Nigel");
        names.add("Rex");
        names.add("Roger");
        names.add("Scoobie");
        names.add("Spangle");
        names.add("Star");
        names.add("Sydney");
        names.add("Tiddles");
    }


}

