package ss3_array_method.practice;

public class ArrayMin {
    public static void main(String[] args) {
        int[]array = new int[]{4, 12, 7, 8, 1, 6,-5, 9};
        int index = minValue(array);
        System.out.println("Phần tử nhỏ nhất là:"+array[index]);
    }
    public static  int minValue(int[]array1){
        int min =0;
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < array1[min]) {
                min = i;
            }
        }
        return min;
    }
}
