package mvc.controller;



import java.util.Scanner;

public class ClassController {
    private static Scanner scanner = new Scanner(System.in);


    public static void menuClass() {
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
                    System.out.println("Mời chọn lại");

            }
        }
    }
}
