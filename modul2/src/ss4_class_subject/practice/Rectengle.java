package ss4_class_subject.practice;

import java.util.Scanner;

class Rectangle {
    double width;
    double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return (this.width * this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều cao");
        double height = sc.nextDouble();
        Rectangle rd = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn \n" + rd.display());
        System.out.println("Chu vi HCN \n" + rd.perimeter());
        System.out.println("Hình chữ nhật của bạn \n" + rd.area());

    }
}
