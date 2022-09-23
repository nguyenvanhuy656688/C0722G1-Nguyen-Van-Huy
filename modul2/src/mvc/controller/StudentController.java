package mvc.controller;

import mvc.service.implStudent.IStudentService;
import mvc.service.implStudent.StudentService;

import java.util.Scanner;

 public class StudentController {
    static IStudentService iStudentService = new StudentService();
    static Scanner scanner = new Scanner(System.in);
    public static void menuStudent() {
        while (true) {
            System.out.print("Chọn danh sách học sinh\n" +
                    "1.Thêm học sinh\n" +
                    "2.Hiển Thị \n" +
                    "3.Xóa học sinh\n" +
                    "4.Tìm học sinh\n" +
                    "5.Chỉnh sửa thông tin học sinh\n" +
                    "6.sắp xếp học sinh theo thứ tự tăng dần dựa theo tên(ASCII) nếu tên bằng nhau thì sắp xếp theo id giảm dần \n" +
                    "7.Thoát\n" +
                    "Mời bạn chọn:");

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
                    break;
                case 6:
                    iStudentService.sortStudent();
                    break;
                case 7:
                    return;
            }

        }

    }

}
