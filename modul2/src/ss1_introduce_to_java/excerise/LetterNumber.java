package ss1_introduce_to_java.excerise;

import java.util.Scanner;

public class LetterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi");
        int number = sc.nextInt();
        String result = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    result += "zero";
                    break;
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
                case 10:
                    result += "ten";
                    break;
            }
            System.out.println(result);
        } else if (number < 20) {
            switch (number) {
                case 1:
                    result += "Eleven";
                    break;
                case 2:
                    result += "Twelve";
                    break;
                case 3:
                    result += "Thirteen";
                    break;
                case 4:
                    result += "Fourteen";
                    break;
                case 5:
                    result += "Fifteen";
                    break;
                case 6:
                    result += "Sixteen";
                    break;
                case 7:
                    result += "Seventeen";
                    break;
                case 8:
                    result += "Eighteen";
                    break;
                case 9:
                    result += "Nineteen";
                    break;
            }
            System.out.println(result);
        }

    }
}
