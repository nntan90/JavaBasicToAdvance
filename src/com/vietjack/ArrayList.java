package com.vietjack;


public class ArrayList<S> {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        System.out.println("Do dai array list: " + arrayList.size());
        for (Integer integer:arrayList){
            System.out.println(integer);
       }
        arrayList.remove(0);
        for (Integer integer:arrayList){
            System.out.println(integer);
        }

        arrayList.clear(); //clear array
        System.out.println("Do dai array list: " + arrayList.size());

        int index = arrayList.indexOf(3);
        System.out.println("Index: " + index);
    }
}
