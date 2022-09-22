package mvc.controller;

import mvc.service.implTeacher.ITeacherService;
import mvc.service.implTeacher.TeacherService;

import java.util.Scanner;

public class TeacherController {
    static ITeacherService iTeacherService = new TeacherService();
    static Scanner scanner = new Scanner(System.in);
    public static void menuTeacher() {
        while (true) {
            System.out.print("Chọn danh sách học sinh\n" +
                    "1.Thêm gv\n" +
                    "2.Hiển Thị \n" +
                    "3.Xóa gv\n" +
                    "4.Tìm gvhọc sinh\n" +
                    "5.Chỉnh sửa thông tin gv\n" +
                    "6.Thoát\n" +
                    "Mời bạn chọn:");


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
                    System.exit(5);
                    break;
            }

        }

    }

}

