package ss14_sort.exercise.illustration_insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationInsertionSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("mảng đã nhập: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int k;
            for (k = i-1; k >=0 && list[k]>key ; k--) {
                list[k+1]= list[k];
            }
            list[k+1]=key;
        }
        System.out.println(Arrays.toString(list));
    }
}
