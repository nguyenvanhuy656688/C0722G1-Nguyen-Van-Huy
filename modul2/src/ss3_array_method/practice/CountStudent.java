package ss3_array_method.practice;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập kích thước:");
            size = sc.nextInt();
            if (size > 32)
                System.out.println("kích thước không được quá 32");
        } while (size > 32);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Nhập điểm thi " + (i + 1));
            array[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Danh sách học sinh thi");
        for (int i = 0; i < array.length; i++) {
                if (array[i] >= 5 && array[i] <= 10)
                    count++;
        }
        System.out.print("\n số học sinh đạt là " + count);
    }
}

