package ss2_loop.exercise;

import java.util.Scanner;

public class HundredPrime {
    public static void main(String[] args){
        int count;
        for (int i = 1; i<=100 ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Số nguyên tố:"+i);
            }
        }
    }
}
