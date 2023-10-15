/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystack1;

/**
 *
 * @author Денис
 */
public class MyStack1 {
    abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw();
}

class Circle extends Shape {
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
