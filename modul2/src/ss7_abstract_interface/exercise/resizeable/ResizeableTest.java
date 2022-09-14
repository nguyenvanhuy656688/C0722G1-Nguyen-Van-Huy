package ss7_abstract_interface.exercise.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        System.out.println("Hình tròn");
        System.out.println("Truoc khi tang");
        Circle circle = new Circle("blue", 2);
        System.out.println(circle.getRadius());
        System.out.println("sau khi tang");
        circle.resize(30);
        System.out.println(circle);
        System.out.println("_____________");
        System.out.println("Hình chữ nhật:");

        System.out.println("độ dài hình chữ nhật trước khi tăng: ");
        Rectangle rectangle = new Rectangle("red", true, 5, 4);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println("Hình chữ nhật sau khi tăng: ");
        rectangle.resize(10);
        System.out.println(rectangle);
        System.out.println("____________");
        System.out.println("Hình vuông:");

        System.out.println("Độ dài hình vuông ban đầu: ");
        Square square = new Square("purple", true, 5);
        System.out.println(square.getSide());
        System.out.println("Hình vuông sau khi tăng: ");
        square.resize(30);
        System.out.println(square);
    }
}


//        public class ResizeableTest {
//            public static void main(String[] args) {
//                Shape[] shapes = new Shape[3];
//                shapes[0] = new Circle("red",5);
//                shapes[1] = new Rectangle("blue",true,4,5);
//                shapes[2] = new Square("black",true,5);
//                System.out.println("Before resize");
//                for(Shape shape:shapes){
//                    System.out.println(shape);
//                }
//                System.out.println("After resize");
//                int x = (int) (Math.random() * 100);
//                shapes.resize(x);
//                for(Shape shape:shapes){
//                    System.out.println(shape);
//                }
//            }
//        }