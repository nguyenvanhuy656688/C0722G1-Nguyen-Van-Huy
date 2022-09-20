package mvc2.controller;

import mvc2.service.implMotorcycle.IMotorcycleService;
import mvc2.service.implMotorcycle.MotorcycleService;

import java.util.Scanner;

public class MotorcycleController {
    static IMotorcycleService iMotorcycleService = new MotorcycleService();
    static Scanner scanner = new Scanner(System.in);

    public static void menuMotorcycle() {
        while (true) {
            System.out.print("Chọn mục của xe máy\n" +
                    "1.Thêm mới phương tiện\n" +
                    "2.Hiển thị phương tiện  \n" +
                    "3.Xóa phương tiện\n" +
                    "4.Tìm phương tiện theo biển số\n" +
                    "6.Thoát\n" +
                    "Mời bạn chọn:");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMotorcycleService.addExpediency();
                    break;
                case 2:
                    iMotorcycleService.displayAllExpediency();
                    break;
                case 3:
                    iMotorcycleService.removeExpediency();
                    break;
                case 4:
                    iMotorcycleService.searchExpediency();
                    break;
                case 5:
                    iMotorcycleService.editExpediency();
                    break;
                case 6:
                    return;
            }


        }
    }
}
