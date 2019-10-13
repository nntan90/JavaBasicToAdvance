package com.vietjack;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input row: ");
        int rows = scanner.nextInt();
        System.out.println("----------------------------");
        for(int i=1; i <= rows; i++){
            for(int j=1; j<=i; j++){
                //System.out.print(j);
                //System.out.print(i);
                if((i+j)%2==1){
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}
