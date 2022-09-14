package ss7_abstract_interface.exercise.colorable;

public class ColorableTest {
    public static void main(String[] args) {

        Shape[] shapesList = new Shape[5];
        shapesList[0] = new Square(4);
        shapesList[1] = new Square(5);
        shapesList[2] = new Square(6);
        shapesList[3] = new Rectangle("yellow","HCN",5,4);
        shapesList[4] = new Circle("red","HCN",5);

        for (int i = 0; i < shapesList.length; i++) {
            System.out.println(shapesList[i].getArea());
            if (shapesList[i] instanceof Square) {
                ((Colorable)shapesList[i]).howToColor();
            }
        }
        System.out.println();
    }
}