package ss7_abstract_interface.exercise.colorable;


public class Circle extends Shape {
    private double radius;

    public Circle(String color,String name, double radius) {
        super(color,name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

