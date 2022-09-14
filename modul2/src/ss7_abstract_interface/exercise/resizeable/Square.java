package ss7_abstract_interface.exercise.resizeable;

public class Square extends Rectangle implements Resizeable {


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }


    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Cạnh="+ getSide() +"\n"+ " Diện tích hình vuông:" + getArea() + "\n" + "Chu vi: " + getPerimeter();

    }
}
