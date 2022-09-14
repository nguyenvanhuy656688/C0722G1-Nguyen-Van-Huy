package ss7_abstract_interface.comparator.exercise.resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật:");
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Trước khi tăng:");
        System.out.println(rectangle);
        System.out.println("Chu vi:"+ rectangle.getPerimeter()+" "+"Diện tích:"+rectangle.getArea());
        System.out.println("Sau khi tăng");
        rectangle.resize(2);
        System.out.println(rectangle);
        System.out.println("Chu vi:"+ rectangle.getPerimeter()+" "+"Diện tích:"+rectangle.getArea());
        System.out.println("__________");
        System.out.println("Hình tròn:");
        Circle circle = new Circle();
        System.out.println("Trước khi tăng:");
        System.out.println(circle);
        System.out.println("Chu vi:"+ circle.getPerimeter()+" "+"Diện tích:"+circle.getArea());
        System.out.println("Sau khi tăng");
        circle.resize(2);
        System.out.println(circle);
        System.out.println("Chu vi:"+ circle.getPerimeter()+" "+"Diện tích:"+circle.getArea());
        System.out.println("__________");
        System.out.println("Hình vuông:");
        Square square = new Square(4);
        System.out.println("Trước khi tăng:");
        System.out.println(square);
        System.out.println("Chu vi:"+ square.getPerimeter()+" "+"Diện tích:"+square.getArea());
        System.out.println("Sau khi tăng");
        square.resize(25);
        System.out.println(square);
        System.out.println("Chu vi:"+ square.getPerimeter()+" "+"Diện tích:"+square.getArea());
    }
}
