package ss2_loop.exercise;

import java.util.Scanner;

public class TwentyPrime {
    public static void main(String[] args) {
        int count;
        int start = 0;
        for (int i = 1; ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+" ");
                start++;
            }
            if(start==20){
                break;
            }
        }
    }
}
