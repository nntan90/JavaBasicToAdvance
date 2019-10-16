package com.vietjack;

public class Dog extends Animal {
    private String tails;
    private String legs;

    public Dog(String weight, String height, String color, String tails, String legs) {
        super(weight, height, color);
        this.tails = tails;
        this.legs = legs;
    }

    public void move(){
        super.move();
        System.out.println("Dog.move() is called");
    }

    public String getTails() {
        return tails;
    }

    public void setTails(String tails) {
        this.tails = tails;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }
}
