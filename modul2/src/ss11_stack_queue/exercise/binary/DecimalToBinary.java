package ss11_stack_queue.exercise.binary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {
        Stack<String> doubles = new Stack<>();
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên : ");
        n = scanner.nextInt();
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        String s ="";
        System.out.println("Số nhị phân: " + binary);
        String[] binary1 = binary.split("");
        for (int i = 0; i < binary1.length; i++) {
            doubles.push((String) binary1[i]);
            s+= binary1[i];
        }
        System.out.println(s);
    }
}
