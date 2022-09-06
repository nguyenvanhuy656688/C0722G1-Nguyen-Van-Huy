package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class BodyWeigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng");
        weight = sc.nextDouble();
        System.out.println("Nhập chiều cao");
        height = sc.nextDouble();
        System.out.println("Chỉ số bmi");
        bmi = weight / Math.pow(height, 2);

        if(bmi<18){
            System.out.println("chỉ số bmi:"+bmi+"underweight");
        }else if(bmi<25.0){
            System.out.println("chỉ số bmi: "+bmi+"normal");
        }else if(bmi<30.0){
            System.out.println("chỉ số bmi:"+bmi+"overweight");
        }else {
            System.out.println("obese:"+bmi);
        }
    }

}
