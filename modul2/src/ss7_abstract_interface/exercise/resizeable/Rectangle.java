package ss7_abstract_interface.exercise.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;


    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = this.length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return  "Hinh chu nhat sau khi hoan thanh: "
                + "width: " + getWidth()
                +" length" +"\t"  + getLength() + " "
                + "Dien tich : " + getArea() +" "
                + "Chu vi :" + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        this.width = this.getWidth() + this.getWidth() * (percent / 100);
        this.length = this.getLength() + this.getLength() * (percent / 100);

    }
}
