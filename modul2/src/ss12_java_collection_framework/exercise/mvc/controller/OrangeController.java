package ss12_java_collection_framework.exercise.mvc.controller;

import ss12_java_collection_framework.exercise.mvc.service.IOrangeService;
import ss12_java_collection_framework.exercise.mvc.service.OrangeService;

import java.util.Scanner;

public class OrangeController {
   private static Scanner scanner = new Scanner(System.in);
   private static IOrangeService iOrangeService = new OrangeService();
   public static void menuOrange(){
      while (true){
         System.out.println("________________________");;
         System.out.print("Chọn thông tin bạn cần của trái cam\n" +
                 "1.Thêm mới trái cam\n" +
                 "2.Hiển thị \n" +
                 "3.xóa\n" +
                 "4.Tìm kiếm \n" +
                 "5.Sắp xếp \n"+
                 "6.Thoát lựa chọn. \n"+
                 "----->Mời bạn chọn:  ");
         int choice=Integer.parseInt(scanner.nextLine());
         switch (choice){
            case 1:
               System.out.println("Bạn lựa chọn thêm cam");
               iOrangeService.addOrange();

               break;
            case 2:
               System.out.println("Bạn lựa chọn hiển thị ");
               iOrangeService.displayOrange();

               break;
            case 3:
               System.out.println("Bạn muốn xóa cam");
               iOrangeService.removeOrange();

               break;
            case 4:
               System.out.println("Bạn muốn tìm kiếm");
               iOrangeService.findOrange();
               break;
            case 5:
               System.out.println("Muốn tăng hay giảm nào");
               iOrangeService.sortOrange();
            case 6:
               System.exit(6);
         }
      }
   }

}
