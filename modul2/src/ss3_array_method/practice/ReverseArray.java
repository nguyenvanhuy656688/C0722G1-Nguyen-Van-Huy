package ss3_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("mời nhập kích thước <20");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Đã vượt quá 20 , mời nhập lại");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Mời nhập phần tử:");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng khi chưa đảo" +Arrays.toString(array));
        for (int j = 0; j < array.length / 2; j++) {
            int convert = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = convert;
        }
        System.out.printf("mảng sau khi đảo:"+Arrays.toString(array));
    }
}
