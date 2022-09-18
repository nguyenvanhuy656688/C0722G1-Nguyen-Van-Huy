package mvc.controller;

import mvc.service.implStudent.IStudentService;
import mvc.service.implStudent.StudentService;

import java.util.Scanner;

 public class StudentController {
    static IStudentService iStudentService = new StudentService();
    static Scanner scanner = new Scanner(System.in);
    public static void menuStudent() {
        while (true) {
            System.out.println("___________");
            System.out.println("chọn Danh sách học sinh");
            System.out.println("1.Thêm học sinh ");
            System.out.println("2.Hiển thị học sinh ");
            System.out.println("3.Xóa học sinh ");
            System.out.println("4.Tìm học sinh ");
            System.out.println("5.chỉnh sửa thông học sinh ");
            System.out.println("6.Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayAllStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5:
                    iStudentService.editStudent();
                case 6:
                    System.exit(6);
                    break;
            }

        }

    }

}
