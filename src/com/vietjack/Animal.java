package com.vietjack;

public class Animal {
    private String weight;
    private String height;
    private String color;

    public void move(){
        System.out.println("Animal.move() is called");
    }

    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public Animal(String weight, String height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
