package mvc2.controller;


import mvc2.service.implOto.IOtoService;
import mvc2.service.implOto.OtoService;

import java.util.Scanner;

public class OtoController {
    static IOtoService iOtoService = new OtoService();
    static Scanner scanner = new Scanner(System.in);

    public static void menuOto() {
        while (true) {
            System.out.print("Chọn mục của ô tô\n" +
                    "1.Thêm mới phương tiện\n" +
                    "2.Hiển thị phương tiện  \n" +
                    "3.Xóa phương tiện\n" +
                    "4.Tìm phương tiện theo biển số\n" +
                    "6.Thoát\n" +
                    "Mời bạn chọn:");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iOtoService.addOto();
                    break;
                case 2:
                    iOtoService.displayAllOto();
                    break;
                case 3:
                    iOtoService.removeOto();
                    break;
                case 4:
                    iOtoService.searchOto();
                    break;
                case 5:
                    iOtoService.editOto();
                    break;
                case 6:
                    return;
            }


        }
    }

}
