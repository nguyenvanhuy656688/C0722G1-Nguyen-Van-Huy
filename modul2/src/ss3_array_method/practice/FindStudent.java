package ss3_array_method.practice;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println(" sinh viên :" + name + "\n"  + " có vị trí là:" + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy học sinh:" + name);
        }

    }
}
