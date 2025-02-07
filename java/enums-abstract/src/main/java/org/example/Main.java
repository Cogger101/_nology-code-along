package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.valueOf("FRIDAY");
        System.out.println(DayOfWeek.SATURDAY.getClass());
        System.out.println(today);
        System.out.println("FRIDAY".equals(today));
        String friday = "Friday";
    }
}