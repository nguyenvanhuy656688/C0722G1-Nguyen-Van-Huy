package ss2_loop.practice;

import java.util.Scanner;

public class CommonWish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập số a:");
        a = sc.nextInt();
        System.out.println("Nhập số b:");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung");
        }
        while (a != b) {
           if(a>b){
               a = a - b;
           }else {
               b = b-a;
           }
        }
        System.out.println("Uoc chung nhỏ nhất:"+a);
    }
}
