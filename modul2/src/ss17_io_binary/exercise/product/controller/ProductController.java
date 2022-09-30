package ss17_io_binary.exercise.product.controller;



import ss17_io_binary.exercise.product.service.IProductService;
import ss17_io_binary.exercise.product.service.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    static IProductService iProductService = new ProductService();

    public static void menuProductService() throws IOException {
        while (true){
            System.out.println("Mời bạn nhập lựa chọn: \n" +
                    "1.Thêm sp\n" +
                    "2.hiển thị tt\n" +
                    "3.xóa sp\n" +
                    "4.Tìm kiếm\n" +
                    "5.thoát\n" +
                    "---->Mời chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductService.addProduct();
                    System.out.println("Bạn chọn thêm!");
                    break;
                case 2:
                    iProductService.display();
                    System.out.println("list display");
                    break;
                case 3:
                    iProductService.remove();
                    System.out.println("Bạn chọn xóa!");
                    break;
                case 4:
                    iProductService.find();
                    System.out.println("chọn find!");
                    break;
                case 5:
                    System.exit(5);
            }
        }
    }
}
