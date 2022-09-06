package ss1_introduce_to_java.excerise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Hello,Nice to meet you:"+name);
    }
}
