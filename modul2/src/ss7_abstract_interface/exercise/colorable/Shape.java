package ss7_abstract_interface.comparator.exercise.colorable;

public abstract class Shape {
    private String color = "green";
    private double height;
    private double width;


    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();

}
