package ss4_class_subject.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {
        return ((-this.getB()) + Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
    }

    public double getRoot2() {
        return ((-this.getB()) - Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
    }

    public double doubleSolution() {
        return (-(this.getB()) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a:");
        double a = sc.nextInt();
        System.out.print("Nhập vào b:");
        double b = sc.nextInt();
        System.out.print("Nhập vào c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta có giá trị: " + quadraticEquation.getDiscriminant());
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("r1 có giá trị: " + quadraticEquation.getRoot1());
            System.out.println("r2 có giá trị: " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép " + quadraticEquation.doubleSolution());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
