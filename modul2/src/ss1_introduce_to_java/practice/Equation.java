package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Giai phương trình bậc nhất");
        System.out.println("Phương trình bậc nhất có dạng là 'a * x + b = 0',nhập giá trị ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        if (a != 0) {
            double answer = -b / a;
            System.out.println("Kết quả x là: " + answer);
        } else if (a == b) {
            System.out.println("X = -1");
        } else {
            System.out.println("X= 0 ");
        }
    }
}
