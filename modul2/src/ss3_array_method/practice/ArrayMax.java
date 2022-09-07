package ss3_array_method.practice;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập độ dài:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Bạn đã nhập quá 20, mời nhập lại");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
            System.out.print("Property list: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("Gía trị lớn nhất là: " + max + " ,at position " + index);
        }
    }
}
