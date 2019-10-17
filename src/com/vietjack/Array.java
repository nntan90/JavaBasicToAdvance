package com.vietjack;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cho mang: ");
        int number = scanner.nextInt();
        int [] array = getArrayInput(number);
        System.out.println("In ra cac gia tri trong mang: ");
        printArray(array);
        int [] sortArray = sortArray(array);
        printArray(sortArray);
        double average = getAverageNumbers(array);
        System.out.println("Gia tri trung binh cua mang tren la: " + average);

    }
    public static int[] sortArray(int [] array){
        int[] sortArray = new int[array.length];
        for(int i = 0; i < array.length - 1; i++){
            for (int j= i+1; j < array.length; j++){
                if (array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        sortArray = array;
        return sortArray;
    }

    public static void printArray(int [] array){
        for(int i=0; i< array.length; i++){
            int count = i + 1;
            System.out.println("Phan tu thu " + count + " co gia tri la: " + array[i]);
        }
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
