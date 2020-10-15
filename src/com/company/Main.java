package com.company;

public class Main {

    public static void main(String[] args) {
// 1-2 point
        int month = 12;
        if (0 < month && month < 3 || month == 12) {
            System.out.println("Зима");
        } else if (2 < month && month < 6) {
            System.out.println("Весна");
        } else if (5 < month && month < 9) {
            System.out.println("Лето");
        } else if (8 < month && month < 12) {
            System.out.println("Осень");
        } else System.out.println("Некорректное число месяца");
// 3 point
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректное число месяца");
                break;
        }
// 4-5 point
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        for (int i = (array.length)-1; i > -1; i--) {
            System.out.print(array[i] + " ");
        }
// 6-7 point
        System.out.println();
        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 11;
        squareArray[0][1] = 12;
        squareArray[0][2] = 13;
        squareArray[1][0] = 14;
        squareArray[1][1] = 15;
        squareArray[1][2] = 16;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "[" + i + "]" + "[" + j + "]" + " ");
            }
            System.out.println();
        }
    }
}