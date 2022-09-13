package ss6_inhertance.exercise.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("red",1.5,5);
        System.out.println("Thể tích là: "+cylinder.getVolume());
        System.out.println("Diện tích là: "+cylinder.getArea());
        System.out.println("Chu vi là: "+cylinder.getPerimeter());
    }
}
