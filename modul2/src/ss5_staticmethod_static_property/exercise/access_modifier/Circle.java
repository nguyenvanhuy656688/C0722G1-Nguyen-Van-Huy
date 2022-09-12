package ss5_staticmethod_static_property.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String Str = "Red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArena() {
        return Math.PI * Math.pow(radius, 2);
    }

}
