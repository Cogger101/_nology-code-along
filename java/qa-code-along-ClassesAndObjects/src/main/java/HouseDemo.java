// Working with Encapsulation

public class HouseDemo {
    public static void main(String[] args) {
    House myHouse = new House();
    House yourHouse = new House(3, 10, "Blue");
    House mumsHouse = new House(4, 12, "Black");




    myHouse.setNumStories(2);
    myHouse.setNumWindows(6);
    myHouse.setColor("Red");

    printHouseData(myHouse);
        System.out.println();
    printHouseData(yourHouse);
        System.out.println();
    printHouseData(mumsHouse);


//    yourHouse.setNumStories(3);
//    yourHouse.setNumWindows(10);
//    yourHouse.setColor("Blue");

//        System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " windows.");
//        System.out.println();
//        System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.getNumStories() + " stories and " + yourHouse.getNumWindows() + " windows.");

    }

    public static void printHouseData(House house){
        System.out.println("The house is " + house.getColor() + " and has " + house.getNumStories() + " stories and " + house.getNumWindows() + " windows.");
        System.out.println();
    };
}
