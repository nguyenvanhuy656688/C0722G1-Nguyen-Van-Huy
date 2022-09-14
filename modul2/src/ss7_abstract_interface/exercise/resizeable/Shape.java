package ss7_abstract_interface.exercise.resizeable;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
