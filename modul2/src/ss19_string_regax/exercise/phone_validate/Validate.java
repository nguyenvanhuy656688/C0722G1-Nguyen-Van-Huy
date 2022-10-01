package ss19_string_regax.exercise.phone_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String PHONE = "[0-9]{2}-0[0-9]{9}";

    public static boolean validate(String regax){
        Pattern pattern = Pattern.compile(PHONE);
        Matcher matcher = pattern.matcher(regax);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bao nhiêu số điện thoại cần kiểm tra:");
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào số điện thoại thứ:"+(i+1)+"cần kiểm tra");
            arr[i]= scanner.nextLine();
        }
        for (String phone:arr) {
            boolean check = Validate.validate(phone);
            System.out.println("SDT: "+phone +" is: " +check);
        }
    }
}
