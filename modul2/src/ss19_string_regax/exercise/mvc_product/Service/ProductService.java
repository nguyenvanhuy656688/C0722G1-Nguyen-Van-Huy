package ss19_string_regax.exercise.mvc_product.Service;

import ss19_string_regax.exercise.mvc_product.model.Product;
import ss19_string_regax.exercise.mvc_product.utils.ProductException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM//yyyy");
    public Product info() throws ProductException {
        String code;
        while (true) {
            try {
                System.out.println("Nhập id sp!");
                code = scanner.nextLine();
                ProductException.idCheck(code);
                break;
            }catch (ProductException e){
                System.out.println( e.getMessage());
            }
        }
        String name;
        while (true){
            try{
                System.out.println("Nhập tên sp!");
                name = scanner.nextLine();
                ProductException.nameCheck(name);
                break;
            }catch (ProductException e){
                System.out.println(e.getMessage());
            }
        }


        System.out.println("Nhập hãng sx!");
        String manufacturer = scanner.nextLine();

        String price;
        while (true){
            try{
                System.out.println("Nhập giá!");
                price = scanner.nextLine();
                if(!price.matches("[1-9][0-9]{3,}")){
                    throw new ProductException("Sai định dạng");
                }
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        LocalDate expiry;
        while (true){
            try {
                System.out.println("Nhập ngày sản xuất dd//mm/yyyy:");
                 expiry = LocalDate.parse(scanner.nextLine(),formatter);
                 ProductException.expiryCheck(expiry,formatter);
                 break;
            }catch (ProductException e){
                System.out.println(e.getMessage());
            }
        }


        Product product = new Product(code,name,manufacturer,Integer.parseInt(price),expiry);
        return product;
    }
    @Override
    public void addProduct() throws IOException, ProductException {
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
        String code = scanner.nextLine();
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
        File file = new File("src\\ss19_string_regax\\exercise\\mvc_product\\data\\input.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        productList = new ArrayList<>();
        String line;
        String[] arr;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            productList.add(new Product(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),LocalDate.parse(arr[4])));
        }
        bufferedReader.close();
        return productList;
    }
    public void writeFile(List<Product> productList) throws IOException {
        File file = new File("src\\ss19_string_regax\\exercise\\mvc_product\\data\\input.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Product product : productList) {
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
