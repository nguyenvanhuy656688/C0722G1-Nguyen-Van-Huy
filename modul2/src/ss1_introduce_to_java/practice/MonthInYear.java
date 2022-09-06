package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class MonthInYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn kiểm tra");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                //System.out.println("Tháng 2 có 28 or 29 ngày");
                daysInMonth = "28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //System.out.println("Tháng: " + month + " có 31 ngày");
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //System.out.println("Tháng: " + month + " có 30 ngày");
                daysInMonth = "30";
                break;
            default:
                //System.out.println("Không tồn tại");
                daysInMonth = "";

        }
        if (!daysInMonth.equals("")) {
            System.out.printf("Tháng %d có %s ngày!", month, daysInMonth);
        } else {
            System.out.print("Không khả thi!");
        }
    }
}
