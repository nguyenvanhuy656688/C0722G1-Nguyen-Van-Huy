package ss15_debug_exception.exercise;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IllegalTriangle {
        int x;
        int y;
        int z;
        while (true){
            try {
                System.out.println("Nhập cạnh x");
                x = Integer.parseInt(scanner.nextLine());
                check(x);
                break;
            }catch (NumberFormatException e){
                System.out.println("Mời nhập lại");
                e.getStackTrace();
            }
        }
        while (true){
            try {
                System.out.println("Nhập cạnh y:");
                y = Integer.parseInt(scanner.nextLine());
                check(y);
                break;
            }catch (NumberFormatException e){
                System.out.println("Mời nhập lại");
                e.getStackTrace();
            }
        }
        while (true){
            try {
                System.out.println("Nhập cạnh z");
                z =Integer.parseInt(scanner.nextLine());
                check(z);
                break;
            }catch (NumberFormatException e){
                System.out.println("Mời nhập lại");
                e.getStackTrace();
            }
        }
        IllegalTriangleException(x,y,z);
    }



    public static void check(int side) throws IllegalTriangle{
        if(side<0){
            throw new IllegalTriangle("Nhập sai r, mời nhập lại");
        }
    }
    public static void IllegalTriangleException(int x, int y,int z) throws IllegalTriangle{
        if(x+y<z || x+z<y || x+z<x){
            throw new IllegalTriangle("Nhập sai r, mời nhập lại cho đúng");
        }
        if (x>0 && y>0 && z>0){
            System.out.println("Tam giác bạn nhập hợp lệ");
        }
    }
}
