package ss3_array_method.exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;
            do {
                System.out.println("Nhập số phần tử số nguyên trong mảng: ");
                n = Integer.parseInt(scanner.nextLine());
                if(n<0){
                    System.out.println("Nhập không đúng quy định , mời nhập lại");
                }
            }while (n < 0);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Nhập số phần tử thứ " + i );
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(min >= array[i]){
                    min = array[i];
                }
            }
            System.out.print("Số nhỏ nhất là: " + min);
    }
}
