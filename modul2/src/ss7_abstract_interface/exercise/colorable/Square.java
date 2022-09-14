package ss7_abstract_interface.exercise.colorable;

public class Square extends Rectangle implements Colorable {


    public Square(double edge) {
        super();
        setEdge(edge);
    }

    public double getEdge() {
        return super.getWidth();
    }

    public String getName() {
        return super.getName();
    }

    public void setEdge(double edge) {
        super.setHeight(edge);
        super.setWidth(edge);
    }



    @Override
    public void howToColor() {
        System.out.println("Color all four sides!");

    }

}
