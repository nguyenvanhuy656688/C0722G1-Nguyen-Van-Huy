package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]array1 = new int[5];
        int[]array2 = new int[4];
        int[]array = new int[9] ;
        System.out.println("Nhập phần tử của mảng 1");
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Nhập phần tử thứ:"+i);
            int num = sc.nextInt();
            array1[i]= num;
            array[i]=array1[i];
        }
        System.out.println("Mảng 1");
        System.out.println(Arrays.toString(array1));
        for (int j = 0; j < array2.length; j++) {
         System.out.println("Nhập phần tử thứ:"+j);
            int num1 = sc.nextInt();
            array2[j]= num1;
            array[j]=array2[j];
        }
        System.out.println("Mảng sau khi gộp");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array1.length ; i++) {
            array[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[i+array1.length]=array2[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
