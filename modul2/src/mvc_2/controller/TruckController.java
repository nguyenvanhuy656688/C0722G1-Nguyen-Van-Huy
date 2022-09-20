package mvc2.controller;


import mvc2.service.implTruck.ITruckService;
import mvc2.service.implTruck.TruckService;

import java.util.Scanner;

public class TruckController {
    static ITruckService iTruckService =new TruckService();
    static Scanner scanner = new Scanner(System.in);

    public static void menuTruck() {
        while (true) {
            System.out.print("Chọn mục của xe tải\n" +
                    "1.Thêm mới phương tiện\n" +
                    "2.Hiển thị phương tiện  \n" +
                    "3.Xóa phương tiện\n" +
                    "4.Tìm phương tiện theo biển số\n" +
                    "6.Thoát\n" +
                    "Mời bạn chọn:");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruckService.addExpediency();
                    break;
                case 2:
                    iTruckService.displayAllExpediency();
                    break;
                case 3:
                    iTruckService.removeExpediency();
                    break;
                case 4:
                    iTruckService.searchExpediency();
                    break;
                case 5:
                    iTruckService.editExpediency();
                    break;
                case 6:
                    return;
            }


        }
    }
}
