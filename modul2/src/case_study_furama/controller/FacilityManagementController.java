package case_study_furama.controller;


import case_study_furama.service.impl_facility.FacilityService;
import case_study_furama.service.impl_facility.IFacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    static Scanner scanner = new Scanner(System.in);
    static IFacilityService iFacilityService = new FacilityService();

    public static void menuFacility() {
        while (true) {
            System.out.print("You can choose:\n" +
                    "1\tDisplay list facility-Cơ sở danh sách hiển thị\n" +
                    "2\tAdd new facility-Thêm cơ sở mới \n" +
                    "3\tDisplay list facility maintenance-Hiển thị danh sách bảo trì cơ sở\n" +
                    "4\tReturn main menu\n" +
                    "------>choose:");

            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    iFacilityService.displayList();
                    break;
                case "2":
                    iFacilityService.add();
                    break;
                case "3":
                    iFacilityService.displayListMaintenance();
                    break;
                case "4":
                    System.exit(4);
            }
        }
    }
}
