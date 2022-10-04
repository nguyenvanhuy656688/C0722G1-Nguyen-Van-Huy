package case_study_furama.controller;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.print("You can choose:\n" +
                    "1.\tEmployee Management-Quản lý nhân sự\n" +
                    "2.\tCustomer Management - Quản lý khách hàng\n" +
                    "3.\tFacility Management - Quản lý cơ sỏ\n" +
                    "4.\tBooking Management - Quản lý đặt lịch\n" +
                    "5.\tPromotion Management -Quản lý Quảng cáo\n" +
                    "-----> choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    EmployeeManagementController.menuEmployer();
                    break;
                case "2":
                    CustomerManagementController.menuCustomer();
                    break;
                case "3":
                    FacilityManagementController.menuFacility();
                    break;
                case "4":
                    BookingManagementController.menuBooking();
                    break;
                case "5":
                    PromotionManagementController.menuPromotion();
                    break;
            }
        }
    }
}

