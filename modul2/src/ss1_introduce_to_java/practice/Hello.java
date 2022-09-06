package ss1_introduce_to_java.practice;

import javafx.scene.shape.Line;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String thongBao = "hello";
        final int a=10;
        System.out.println("Thông báo:"+thongBao);
        System.out.println("bạn còn thiếu tui "+a+"K");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi = sc.nextInt();
        System.out.println("Nhập lớp");
        int lop = sc.nextInt();

        System.out.println("______");
        System.out.println("Họ và tên là: " +hoVaTen);
        System.out.println("Tuổi là : " +tuoi);
        System.out.println("Lớp: "+lop);
    }
}
