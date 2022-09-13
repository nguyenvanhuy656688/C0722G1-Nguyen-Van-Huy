package ss6_inhertance.exercise.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*Math.PI*Math.pow(super.getRadius(),2);

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                super.toString()+
                '}';
    }
}
