package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int element = Integer.parseInt(scanner.nextLine());
        int[] arrs = new int[element];
        for (int i = 0; i < arrs.length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            arrs[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrs));
        int temp;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                if (arrs[i] < arrs[j]) {
                    temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrs));

        int c = binarySeach(arrs, 8, 0, arrs.length - 1);
        System.out.printf("vị trí thứ %s" ,c);
    }

    public static int binarySeach(int[] arr, int k, int left, int right) {
        int mid = (right + left) / 2;
        if (arr[mid] == k) {
            return mid;
        }
        if (k > arr[mid]) {
            return binarySeach(arr, k, mid + 1, right);
        }
        if (k < arr[mid]) {
            return binarySeach(arr, k, left, mid - 1);
        }
        return -1;
    }
}
