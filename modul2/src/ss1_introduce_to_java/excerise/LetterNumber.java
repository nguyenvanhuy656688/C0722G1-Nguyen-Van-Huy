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
        } else if (number > 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tenS = "";
            String oneS = "";
            switch (tens) {
                case 2:
                    tenS = "Twenty";
                    break;
                case 3:
                    tenS = "Thirty";
                    break;
                case 4:
                    tenS = "Forty";
                    break;
                case 5:
                    tenS = "Fifty";
                    break;
                case 6:
                    tenS = "Sixty";
                    break;
                case 7:
                    tenS = "Seventy";
                    break;
                case 8:
                    tenS = "Eighty";
                    break;
                case 9:
                    tenS = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    oneS = "One";
                    break;
                case 2:
                    oneS = "Two";
                    break;
                case 3:
                    oneS = "Three";
                    break;
                case 4:
                    oneS = "Four";
                    break;
                case 5:
                    oneS = "Five";
                    break;
                case 6:
                    oneS = "Six";
                    break;
                case 7:
                    oneS = "Seven";
                    break;
                case 8:
                    oneS = "Eight";
                    break;
                case 9:
                    oneS = "Nine";
                    break;
            }
            System.out.println(tenS + oneS);
        } else if (number >= 100 && number <= 999) {
            int huns = number / 100;
            int huns1 = number % 100;
            int tens0 = number / 10;
            int tens1 = tens0 % 10;
            int ones = number % 10;
            String tenS = "";
            String oneS = "";
            String hunS = "";

            switch (huns) {
                case 1:
                    hunS = "Hundred";
                    break;
                case 2:
                    hunS = "TwoHundred";
                    break;
                case 3:
                    hunS = "ThreeHundred";
                    break;
                case 4:
                    hunS = "FourHundred";
                    break;
                case 5:
                    hunS = "FiveHundred";
                    break;
                case 6:
                    hunS = "SixHundred";
                    break;
                case 7:
                    hunS = "SevenHundred";
                    break;
                case 8:
                    hunS = "EightHundred";
                    break;
                case 9:
                    hunS = "NineHundred";
                    break;
            }
            if (huns1 >= 20) {
                switch (huns1 / 10) {
                    case 2:
                        tenS = "Twenty";
                        break;
                    case 3:
                        tenS = "Thirty";
                        break;
                    case 4:
                        tenS = "Forty";
                        break;
                    case 5:
                        tenS = "Fifty";
                        break;
                    case 6:
                        tenS = "Sixty";
                        break;
                    case 7:
                        tenS = "Seventy";
                        break;
                    case 8:
                        tenS = "Eighty";
                        break;
                    case 9:
                        tenS = "Ninety";
                        break;
                }

                switch (ones) {
                    case 1:
                        oneS = "One";
                        break;
                    case 2:
                        oneS = "Two";
                        break;
                    case 3:
                        oneS = "Three";
                        break;
                    case 4:
                        oneS = "Four";
                        break;
                    case 5:
                        oneS = "Five";
                        break;
                    case 6:
                        oneS = "Six";
                        break;
                    case 7:
                        oneS = "Seven";
                        break;
                    case 8:
                        oneS = "Eight";
                        break;
                    case 9:
                        oneS = "Nine";
                        break;
                }

                System.out.println(hunS + tenS + oneS);
            } else if (huns1 < 20 && huns1 >= 10) {
                switch (huns1) {
                    case 10:
                        tenS = "Ten";
                        break;
                    case 11:
                        tenS = "Eleven";
                        break;
                    case 12:
                        tenS = "Twelve";
                        break;
                    case 13:
                        tenS = "Thirteen";
                        break;
                    case 14:
                        tenS = "Fourteen";
                        break;
                    case 15:
                        tenS = "Fifteen";
                        break;
                    case 16:
                        tenS = "Sixteen";
                        break;
                    case 17:
                        tenS = "Seventeen";
                        break;
                    case 18:
                        tenS = "Eighteen";
                        break;
                    case 19:
                        tenS = "Nineteen";
                        break;

                }
                System.out.println(hunS + tenS);
            } else if (huns1 == 0) {
                switch (huns) {
                    case 1:
                        hunS = "Hundred";
                        break;
                    case 2:
                        hunS = "TwoHundred";
                        break;
                    case 3:
                        hunS = "ThreeHundred";
                        break;
                    case 4:
                        hunS = "FourHundred";
                        break;
                    case 5:
                        hunS = "FiveHundred";
                        break;
                    case 6:
                        hunS = "SixHundred";
                        break;
                    case 7:
                        hunS = "SevenHundred";
                        break;
                    case 8:
                        hunS = "EightHundred";
                        break;
                    case 9:
                        hunS = "NineHundred";
                        break;
                }
                System.out.println(hunS);
            } else if (tens1 == 0) {
                switch (ones) {
                    case 1:
                        oneS = "One";
                        break;
                    case 2:
                        oneS = "Two";
                        break;
                    case 3:
                        oneS = "Three";
                        break;
                    case 4:
                        oneS = "Four";
                        break;
                    case 5:
                        oneS = "Five";
                        break;
                    case 6:
                        oneS = "Six";
                        break;
                    case 7:
                        oneS = "Seven";
                        break;
                    case 8:
                        oneS = "Eight";
                        break;
                    case 9:
                        oneS = "Nine";
                        break;
                }
                System.out.println(hunS + oneS);
            }
        }

    }
}
