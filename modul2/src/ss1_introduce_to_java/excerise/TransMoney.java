package ss1_introduce_to_java.excerise;

import java.util.Scanner;

public class TransMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd;
        double rate =23000;
        System.out.println("Mời nhập số đô la muốn đổi");
        usd = sc.nextDouble();
        double vnd = usd*rate;
        System.out.println("Số tiền bạn quy đổi sang là:"+vnd);

    }
}
