package ss4_class_subject.exercise;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan0 = new Fan();
        int max = fan0.getFAST();
        int medium = fan0.getMEDIUM();
        int low = fan0.getSLOW();
        System.out.println("Nhập trạng thái bật tắt true-false");
        Scanner sc = new Scanner(System.in);
        boolean on = sc.nextBoolean();
        if (on == true) {
            System.out.println("Máy quạt 1 đang bật!");
            Fan fan = new Fan(max, 10.0, "yellow", true);
            System.out.println("máy quạt 1: " + fan);
        } else {
            System.out.println("Máy quạt 1 tắt , sang quạt 2!");
            Fan fan1 = new Fan(medium, 5.0, "blue", false);
            System.out.println("Trạng thái máy quạt 2: ");
            System.out.println("Máy quạt 2: " + fan1);
        }
    }
}

