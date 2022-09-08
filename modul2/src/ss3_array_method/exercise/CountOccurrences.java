package ss3_array_method.exercise;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int count = 0;
        System.out.println("Nhập chuỗi ");
        str = sc.nextLine();
        System.out.println("nhập ký tự cần kiểm tra ");
        char characters = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (characters == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(" kí tự: " + characters + " xuất hiên " + count + "lần");
    }
}
