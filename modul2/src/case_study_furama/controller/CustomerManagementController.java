package case_study_furama.controller;

import case_study_furama.service.impl_customer.CustomerService;
import case_study_furama.service.impl_customer.ICustomerService;

import java.io.IOException;
import java.util.Scanner;

public class CustomerManagementController {
    static Scanner scanner = new Scanner(System.in);
    static ICustomerService iCustomerService = new CustomerService();

    public static void menuCustomer() throws IOException {
        while (true) {
            System.out.print("You can choose:\n" +
                    "1.\tDisplay list customers-Hiển thị danh sách khách hàng\n" +
                    "2.\tAdd new customer-Thêm khách hàng mới\n" +
                    "3.\tEdit customer-thay đổi khách hàng\n" +
                    "4.\tReturn main menu\n" +
                    "------>choose:");

            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    iCustomerService.displayListCustome();
                    break;
                case "2":
                    iCustomerService.addNewCustome();
                    break;
                case "3":
                    iCustomerService.editCustome();
                    break;
                case "4":
                    System.exit(4);
                default:
                    System.out.println("Nhập ko hợp lệ , nhập lại");
            }
        }
    }
}