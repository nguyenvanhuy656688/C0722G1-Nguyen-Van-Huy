package case_study_furama.controller;

import case_study_furama.service.impl_employer.EmployerService;
import case_study_furama.service.impl_employer.IEmployerService;

import java.util.Scanner;

public class EmployeeManagementController {
    static IEmployerService iEmployerService = new EmployerService();
    public static void menuEmployer(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("You can choose:\n" +
                "1\tDisplay list employees-Hiển thị danh sách nhân viên\n" +
                "2\tAdd new employee-Thêm nhân viên mới\n" +
                "3\tEdit employee-Chỉnh sửa nhân viên\n" +
                "4\tReturn main menu\n" +
                "------>choose:");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                iEmployerService.displayList();
                break;
            case 2:
                iEmployerService.addEmployer();
                break;
            case 3:
                iEmployerService.editCustome();
            case 4:
                System.exit(4);
        }
    }

}
