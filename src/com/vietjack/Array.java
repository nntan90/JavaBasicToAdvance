package com.vietjack;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cho mang: ");
        int number = scanner.nextInt();
        int [] array = getArrayInput(number);
        System.out.println("In ra cac gia tri trong mang: ");
        for(int i=0; i< array.length; i++){
            int count = i + 1;
            System.out.println("Phan tu thu " + count + " co gia tri la: " + array[i]);
        }
        double average = getAverageNumbers(array);
        System.out.println("Gia tri trung binh cua mang tren la: " + average);

    }
    public static int[] getArrayInput(int num){
        Scanner scanner = new Scanner(System.in);
        int []array = new int[num];
        System.out.println("Nhap gia tri cho mang: ");
        for (int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double getAverageNumbers(int[] array){
        System.out.println("Tinh trung binh cac gia tri trong mang: ");
        double total =0.0d;
        for (int i=0; i< array.length;i++){
            total += array[i];
        }
        return total/array.length;
    }

}
