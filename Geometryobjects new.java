/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geometryobjects;

/**
 *
 * @author Денис
 */
abstract class ThreeDGeometricObject {
    public abstract double volume();
    public abstract double surfaceArea();
    public abstract double getHeight(); 
    public abstract double getRadius(); 
}

class Ellipsoid extends ThreeDGeometricObject {
    private double axisA;
    private double axisB;
    private double axisC;

    public Ellipsoid(double axisA, double axisB, double axisC) {
        this.axisA = axisA;
        this.axisB = axisB;
        this.axisC = axisC;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * axisA * axisB * axisC;
    }

    @Override
    public double surfaceArea() {
        double p = Math.pow(axisA * axisB, 1.6);
        double q = Math.pow(axisA * axisC, 1.6);
        double r = Math.pow(axisB * axisC, 1.6);
        return 4 * Math.PI * Math.pow((p + q + r) / 3, 1 / 1.6);
    }

    @Override
    public double getHeight() {
        return 2 * axisC;
    }

    @Override
    public double getRadius() {
        return Math.max(axisA, Math.max(axisB, axisC));
    }
}

class Sphere extends ThreeDGeometricObject {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getHeight() {
        return 2 * radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}

class Cylinder extends ThreeDGeometricObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}

class Main {
    public static void main(String[] args) {
        Ellipsoid ellipsoid = new Ellipsoid(3.0, 4.0, 5.0);
        Sphere sphere = new Sphere(2.0);
        Cylinder cylinder = new Cylinder(3.0, 6.0);

        displayInfo(ellipsoid);
        displayInfo(sphere);
        displayInfo(cylinder);
    }

    public static void displayInfo(ThreeDGeometricObject object) {
        System.out.println(object.getClass().getSimpleName() + " Volume: " + object.volume());
        System.out.println(object.getClass().getSimpleName() + " Surface Area: " + object.surfaceArea());
        System.out.println(object.getClass().getSimpleName() + " Height: " + object.getHeight());
        System.out.println(object.getClass().getSimpleName() + " Radius: " + object.getRadius());
        System.out.println();
    }
}
