package ss19_string_regax.exercise.mvc_product.Service;

import ss19_string_regax.exercise.mvc_product.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    public Product info(){
        System.out.println("Nhập id sp!");
        Integer code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sp!");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sx!");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập giá!");
        Integer price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sản xuất dd//mm/yyyy:");
        String expiry = scanner.nextLine();
        Product product = new Product(code,name,manufacturer,price,expiry);
        return product;
    }
    @Override
    public void addProduct() throws IOException {
        productList = readFile();
        Product product = this.info();
        productList.add(product);
        System.out.println("thêm thành công");
        writeFile(productList);
    }

    @Override
    public void display() throws IOException {
        productList = readFile();
        for (Product product: productList) {
            System.out.println(product);
        }
        System.out.println("Danh sách hiển thị");
    }

    @Override
    public void remove() throws IOException {
        productList = readFile();
        System.out.println("Nhập mã sp cần xóa");
        Integer code = Integer.parseInt(scanner.nextLine());
        String choose;
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getCode().equals(code)){
                System.out.println("Bạn có muốn xóa sp :"+ productList.get(i));
                System.out.println("Gõ Y nếu muốn xóa");
                choose = scanner.nextLine();
                if(choose.equals("Y")){
                    productList.remove(i);
                    System.out.println("Đã xóa");
                }
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        } else {
            writeFile(productList);
        }
    }

    @Override
    public void find() throws IOException {
        productList = readFile();
        System.out.println("Nhập tên cần tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size() ; i++) {
            if(productList.get(i).getName().equals(name)){
                System.out.println(productList.get(i));
            }
            System.out.println("Đã tìm thấy");
        }
    }
    public List<Product> readFile() throws IOException {
        File file = new File("src\\ss17_io_binary\\exercise\\product\\data\\product.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        productList = new ArrayList<>();
        String line;
        String[] arr;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            productList.add(new Product(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]));
        }
        bufferedReader.close();
        return productList;
    }
    public void writeFile(List<Product> productList) throws IOException {
        File file = new File("src\\ss17_io_binary\\exercise\\product\\data\\product.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Product product : productList) {
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
