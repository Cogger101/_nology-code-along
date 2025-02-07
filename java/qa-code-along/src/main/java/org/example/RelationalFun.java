package org.example;

public class RelationalFun {
    public static void main (String[] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "Sean";
        String yourName = "Sean";

        System.out.println("myBool is "+ myBool);
        System.out.println("yourBool is " + yourBool);

        boolean ageCompare = myAge > yourAge;

        System.out.println("myage > yourAge?: " + ageCompare);

        ageCompare = yourAge > bobsAge;
        System.out.println("youAge > bobsAge?: " + ageCompare);

        ageCompare = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageCompare);

        boolean nameCompare =  myName.equals(yourName);
        System.out.println("do names match: " + nameCompare);

        int currentAge = 30;
        boolean isGreater21 = currentAge >= 21;
        System.out.println("my age compared to 21: " + isGreater21);

    }
}
