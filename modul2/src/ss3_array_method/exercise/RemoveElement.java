package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào độ lớn phần tử của mảng");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);
        int[] array = new int[n];
        System.out.println("Nhập vào phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("______");
        System.out.println("Nhập phần tử cần phải xóa 'x'");
        int x = sc.nextInt();
        boolean check=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                check=true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }

        if(check==false){
            System.out.println("Số có không trong mảng");
        } else {
            System.out.println("Số có trong mảng");
        }
        System.out.println(Arrays.toString(array));
//        int c = 0;
//        int x ;
//        for (int i = 0; i < n; i++) {
//            x = sc.nextInt();
//            for (i = 0; i < n; i++) {
//                if (array[i] != x) {
//                    array[c] = array[i];
//                    c++;
//                }
//            }array[n-1] = 0;
//        }
//        System.out.println("Mảng sau khi xóa");
//        System.out.println(Arrays.toString(array));
    }
}

