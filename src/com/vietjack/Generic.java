package com.vietjack;

import java.util.ArrayList;
import java.util.List;

abstract class Sharp{
    abstract void draw();
}

class Rectangle extends Sharp{

    @Override
    void draw() {
        System.out.println("Ve hinh chu nhat");
    }
}

class Circle extends Sharp{

    @Override
    void draw() {
        System.out.println("Ve hinh tron");
    }
}

public class Generic {
    public static void main(String[] args) {
        List<Rectangle> rectangle = new ArrayList<Rectangle>();
        rectangle.add(new Rectangle());
        List<Circle> circle = new ArrayList<Circle>();
        circle.add(new Circle());
        drawSharp(rectangle);
        drawSharp(circle);
    }
    public static void drawSharp(List<? extends Sharp> list){
        // ? -> wildcard -> search class which is extended from Sharp
        for (Sharp s:list) {
            s.draw();
        }
    }
}

