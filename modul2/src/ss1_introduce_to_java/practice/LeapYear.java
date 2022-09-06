package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm");
        int year = sc.nextInt();
        boolean leapYear1 = false;
        boolean isLeapYear = year % 4 == 0;
        if (isLeapYear) {
            boolean isLeapYear1 = year % 100 == 0;
            if (isLeapYear1) {
                boolean isLeapYear4 = year % 400 == 0;
                if (isLeapYear4) {
                    leapYear1 = true;
                }

            } else {
                leapYear1 = true;


            }
        }
        if (leapYear1) {
            System.out.println("  là năm nhuận" + year);
        }else {
            System.out.println("năm:"+year+"không phải năm nhuận");
        }

    }
}
