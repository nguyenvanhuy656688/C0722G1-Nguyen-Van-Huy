package ss3_array_method.exercise;

import java.util.Scanner;

public class Matrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số hàng: ");
            int row = Integer.parseInt(sc.nextLine());
            System.out.println("nhập số cột: ");
            int col = Integer.parseInt(sc.nextLine());
            int[][] array = new int[row][col];
            for (int i = 0; i < row ; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("Nhập phần tử mảng 1 chiều vị trí "+i+" với các phần tử vị trí "+j);
                    array[i][j] = Integer.parseInt(sc.nextLine());
                }
            }
            int total =0;
            for (int i = 0; i <array.length ; i++) {
                total = total +array[i][i];
            }
            System.out.println("_____");
            System.out.println("Tổng đường chéo 1: "+total);

            int total1 = 0;
            for (int i = 0; i < array.length; i++) {
                total1 += array[i][array.length-1-i];
            }
            System.out.println("Tổng đường chéo 2: "+total1);


        }
}
