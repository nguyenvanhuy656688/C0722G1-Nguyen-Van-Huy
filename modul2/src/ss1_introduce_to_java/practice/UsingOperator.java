package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class UsingOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài");
        double heigh = sc.nextDouble();
        System.out.println("Tính diện tích ");
        double area = width * heigh;
        System.out.println("Diện tích là: " + area);
    }
}
