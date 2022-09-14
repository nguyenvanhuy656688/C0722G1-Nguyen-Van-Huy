package ss7_abstract_interface.comparator.exercise.resizeable;

import ss6_inhertance.practice.Shape;

public class Circle implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Radius=  " + getRadius();

    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + (radius * percent / 100);
    }
}

