package case_study_furama.controller;

import case_study_furama.service.impl_promotion.IPromotionService;
import case_study_furama.service.impl_promotion.PromotionService;

import java.util.Scanner;

public class PromotionManagementController {
    static IPromotionService iPromotionService = new PromotionService();
    public static void menuPromotion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can choose:\n" +
                "1.\tDisplay list customers use service-Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                "2.\tDisplay list customers get voucher-Danh sách hiển thị khách hàng nhận được voucher\n" +
                "3.\tReturn main menu\n" +
                "------>choose:");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                iPromotionService.displayListCustomeService();
                break;
            case 2:
                iPromotionService.displayListCustomeVoucher();
                break;
            case 3:
                System.exit(3);
        }
    }
}
