/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author Денис
 */
class Animal {
    String name;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    void live() {
        System.out.println(name + " is living.");
    }
}

class Cat extends Animal {
    String type;

    public Cat(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    void live() {
        System.out.println(type + " Cat lives...");
    }
    void live(int hours) {
        System.out.println(type + " Cat lives for " + hours + " hours a day.");
    }
}

class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("UnknownCat", "Persian");

        myCat.live();
        myCat.live(16);
    }
}
