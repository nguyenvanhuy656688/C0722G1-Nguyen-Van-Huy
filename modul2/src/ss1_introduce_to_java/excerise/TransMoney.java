package ss1_introduce_to_java.excerise;

import java.util.Scanner;

public class TransMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd,vnd=23000;
        System.out.println("Mời nhập số đô la muốn đổi");
        usd = sc.nextDouble();
        double tranFer= usd*vnd;
        System.out.println("Số tiền bạn quy đổi sang là:"+tranFer);

    }
}
