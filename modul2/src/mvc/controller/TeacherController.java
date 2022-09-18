package mvc.controller;

import mvc.service.implTeacher.ITeacherService;
import mvc.service.implTeacher.TeacherService;

import java.util.Scanner;

public class TeacherController {
    static ITeacherService iTeacherService = new TeacherService();
    static Scanner scanner = new Scanner(System.in);
    public static void menuTeacher() {
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
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayAllTeacher();
                    break;
                case 3:
                    iTeacherService.removeTeacher();
                    break;
                case 4:
                    iTeacherService.searchTeacher();
                    break;
                case 5:
                    iTeacherService.editTeacher();
                case 6:
                    System.exit(6);
                    break;
            }

        }

    }

}

