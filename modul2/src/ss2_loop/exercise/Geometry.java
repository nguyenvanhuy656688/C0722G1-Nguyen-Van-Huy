package ss2_loop.exercise;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println(" Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            String str = "";
            switch (choice) {
                case 1:
                    System.out.println("in hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            str += " *";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông, cạnh góc vuông ở botton left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 3:
                    System.out.println("In hình tam giác vuông, cạnh ở top-left");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 4:
                    System.out.println("In hình tam giác cân");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            str += " ";
                        }
                        for (int j = 1; j <= i; j++) {
                            str += "* ";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                default:
                    System.out.println("Không có");
            }
        }
    }
}
