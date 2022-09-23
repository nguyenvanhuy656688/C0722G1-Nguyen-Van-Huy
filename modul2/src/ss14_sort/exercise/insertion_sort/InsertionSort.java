package ss14_sort.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
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

    public static void main(String[] args) {
        insertSort(list);
    }
}
