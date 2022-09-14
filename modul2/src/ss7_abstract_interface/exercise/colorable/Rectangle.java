package ss7_abstract_interface.exercise.colorable;

public class Rectangle extends Shape {
    private double width;
    private double height;


   public Rectangle(){};

    public Rectangle(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
