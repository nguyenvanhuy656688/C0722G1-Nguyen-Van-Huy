package ss6_inhertance.exercise.oveablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,5);
        System.out.println(movablePoint);
        movablePoint =movablePoint.move();
        System.out.println(movablePoint);
    }
}
