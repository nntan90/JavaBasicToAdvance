package com.vietjack;

public class DoWhile {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        do{
            num ++;
            if(isOddNumber(num) == false){
                continue;
            }
            if(num >= 25 && num <= 35){
                continue;
            }
            System.out.println("Day la so le: " + num);
            count ++;
        }while (num <= 40);
        System.out.println("Co tong cong " + count + " so le");


    }

    public static boolean isOddNumber(int num){
        if(num % 2 == 0){
            return false;
        } else {
            return true;
        }
    }
}
