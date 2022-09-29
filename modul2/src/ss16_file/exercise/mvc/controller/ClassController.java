package ss16_file.exercise.mvc.controller;



import mvc.controller.StudentController;
import mvc.controller.TeacherController;
import mvc.service.implStudent.StudentException;

import java.io.IOException;
import java.util.Scanner;

public class ClassController {
    private static Scanner scanner = new Scanner(System.in);


    public static void menuClass() throws StudentException, IOException {
        while (true) {
            System.out.print("Chào mừng bạn đến với chương trình quản lý Codegym\n" +
                    "1. Học sinh\n" +
                    "2. Giáo viên\n" +
                    "3. thoát\n" +
                    "Xin mời nhập vào đây: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(3);
                    break;
                default:
                    System.out.println("Mời chọn lại");

            }
        }
    }
}
