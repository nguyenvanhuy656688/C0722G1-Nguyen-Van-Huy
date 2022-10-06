package case_study_furama.controller;


import case_study_furama.service.impl_facility.FacilityService;
import case_study_furama.service.impl_facility.IFacilityService;
import case_study_furama.ultis.FacilityException;

import java.io.IOException;
import java.util.Scanner;

public class FacilityManagementController {
    static Scanner scanner = new Scanner(System.in);
    static IFacilityService iFacilityService = new FacilityService();

    public static void menuFacility() throws FacilityException, IOException {
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
                    while (true){
                        System.out.print("You can choose:\n" +
                                "1.\tAdd New Villa\n" +
                                "2.\tAdd New House\n" +
                                "3.\tAdd New Room\n" +
                                "4.\tBack to menu\n" +
                                "----->Choose:");
                        String choose1 = scanner.nextLine();
                        switch (choose1){
                            case "1":
                                iFacilityService.addVilla();
                                break;
                            case "2":
                                iFacilityService.addHouse();
                                break;
                            case "3":
                                iFacilityService.addRoom();
                                break;
                            case "4":
                                return;
                            default:
                                System.out.println("Mời chọn số đúng");
                        }
                    }
                case "3":
                    iFacilityService.displayListMaintenance();
                    break;
                case "4":
                    System.exit(4);
            }
        }
    }
}
