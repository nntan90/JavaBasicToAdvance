package com.vietjack;

import java.util.Scanner;

public class SwitchCase {

    /**
     * Method check month
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input month: ");
        int month = scanner.nextInt();
        int numberOfDays;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                System.out.println("Month " + month + ": This month is " + numberOfDays + " days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                System.out.println("Month " + month + ": This month is " + numberOfDays + " days");
                break;
            case 2:
                System.out.println("Please input year: ");
                int year = scanner.nextInt();
                if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                    numberOfDays = 29;
                    System.out.println("Month " + month + ": This month is " + numberOfDays + " days");
                    break;
                } else {
                    numberOfDays = 28;
                    System.out.println("Month " + month + ": This month is " + numberOfDays + " days");
                    break;
                }
            default:
                System.out.println("Invalid month");
        }
    }
}
