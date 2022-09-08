package ss3_array_method.exercise;

import java.util.Scanner;

public class FinxMax {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập số cột: ");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số hàng: ");
            int row = Integer.parseInt(scanner.nextLine());
            int[][] arrays = new int[col][row];
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.println("Nhập phần tử mảng 1 chiều vị trí "+i+" với các phần tử vị trí "+j);
                    arrays[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            int max = 0;
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if (arrays[i][j] > max) {
                        max = arrays[i][j];
                    }
                }
            }
            System.out.println(max + " là số lớn nhất! ");
    }
}
