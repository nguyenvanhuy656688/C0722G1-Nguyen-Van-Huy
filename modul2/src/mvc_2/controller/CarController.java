package mvc2.controller;


import java.util.Scanner;

public class CarController {

    public static void menuCar() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("Chọn danh sách xe\n" +
                    "1.Xe máy\n" +
                    "2.xe ô tô \n" +
                    "3.xe tải\n" +
                    "4.thoat\n" +
                    "Mời bạn chọn loại xe: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    MotorcycleController.menuMotorcycle();
                    break;
                case 2:
                    OtoController.menuOto();
                    break;
                case 3:
                    TruckController.menuTruck();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Mời chọn lại");
            }
        }
    }
}
