/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moveable;

/**
 *
 * @author Денис
 */
interface Moveable {
    void move();
}

interface Resizable extends Moveable {
    void resize();
}

class Shape implements Resizable {
    @Override
    public void move() {
        System.out.println("Moving the shape.");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the shape.");
    }
}
