package mvc.controller;

import mvc.service.implStudent.IStudentService;
import mvc.service.implStudent.StudentService;
import mvc.service.implTeacher.ITeacherService;

import java.util.Scanner;

public class ClassController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService iStudentService = new StudentService();
    private static ITeacherService iTeacherService = (ITeacherService) new TeacherController();

    public static void menuPerson() {
        while (true) {
            System.out.println("Chào mừng bạn đến với chương trình quản lý Codegym");
            System.out.println("1. Học sinh");
            System.out.println("2. Giáo viên");
            System.out.println("3.Thoát");
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
                    System.out.println("Bạn nhập sai. Vui lòng nhập lại!");

            }
        }
    }
}
