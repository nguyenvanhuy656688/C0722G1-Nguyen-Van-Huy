package case_study_furama.controller;


import case_study_furama.service.impl_booking.BookingService;
import case_study_furama.service.impl_booking.IBookingService;

import java.util.Scanner;

public class BookingManagementController {
    static Scanner scanner = new Scanner(System.in);
    static IBookingService iBookingService = new BookingService();

    public static void menuBooking() {
        while (true) {
            System.out.print("You can choose:\n" +
                    "1.\tAdd new booking-Thêm đặt chỗ mới\n" +
                    "2.\tDisplay list booking-Hiển thị danh sách đặt chỗ\n" +
                    "3.\tCreate new contracts-Tạo hợp đồng mới\n" +
                    "4.\tDisplay list contracts-Hiển thị hợp đồng danh sách\n" +
                    "5.\tEdit contracts-Chỉnh sửa hợp đồng\n" +
                    "6.\tReturn main menu\n" +
                    "------>choose:");

            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    iBookingService.addBooking();
                    break;
                case "2":
                    iBookingService.displayListBook();
                    break;
                case "3":
                    iBookingService.createConstract();
                    break;
                case "4":
                    iBookingService.displayListConstract();
                    break;
                case "5":
                    iBookingService.editConstract();
                    break;
                case "6":
                    System.exit(6);
            }
        }
    }
}
