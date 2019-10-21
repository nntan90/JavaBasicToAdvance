package com.cinema;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("CGV",3,3);
        cinema.printCinemaSeat();
        if (cinema.reserveSeat("A03")){
            System.out.println("Thanh toan tien ve !!!");
        } else {
            System.out.println("Ghe da duoc dat");
        }

    }
}
