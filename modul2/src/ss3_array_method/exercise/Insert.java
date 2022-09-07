package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ lớn của mảng");
        int size = sc.nextInt();
        System.out.println("Nhập phần tử của mảng");
        int[]array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần chèn");
        int num = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        if(index<-1 || index>= array.length-1){
            System.out.println("Không thể chèn");
        }else {
            array[index-1]=num;
        }
        System.out.println("Mảng sau khi chèn");
        System.out.println(Arrays.toString(array));

    }
}
