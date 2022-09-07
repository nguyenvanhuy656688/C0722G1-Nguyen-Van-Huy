package ss2_loop.practice;

import java.util.Scanner;

public class Interes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        System.out.println("Nhập số tiền gửi");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất");
        interest = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < month ; i++) {
            total += money * (interest/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi = "+total);
    }
}
