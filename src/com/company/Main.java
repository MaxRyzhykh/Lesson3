package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 12;
        if (0 < month && month < 3 || month == 12) {
            System.out.println("Зима");
        } else if (2 < month && month < 6) {
            System.out.println("Весна");
        } else if (5 < month && month < 9) {
            System.out.println("Лето");
        } else if (8 < month && month < 12) {
            System.out.println("Осень");
        }


    }
}
