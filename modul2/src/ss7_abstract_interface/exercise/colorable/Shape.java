package ss7_abstract_interface.exercise.colorable;

public abstract class Shape {
    private String color = "green";
    private String name;

    public Shape() {
    }

    public Shape(String color,String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
