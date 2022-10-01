package ss19_string_regax.exercise.code_validate;

import ss19_string_regax.practice.validate_account.AccountExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String CHARACTER = "[CAP][0-9]{4}[GHIKLM]";

    public static boolean validate(String regax){
        Pattern pattern = Pattern.compile(CHARACTER);
        Matcher matcher = pattern.matcher(regax);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số mã cần kiểm tra:");
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào mã lớp của bạn:");
            arr[i]= scanner.nextLine();
        }
        for (String account:arr) {
            boolean check = Validate.validate(account);
            System.out.println("Mã: "+account +" is: " +check);
        }
    }

}
