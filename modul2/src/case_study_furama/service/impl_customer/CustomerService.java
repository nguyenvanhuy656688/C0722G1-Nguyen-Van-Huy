package case_study_furama.service.impl_customer;

import case_study_furama.model.model_person.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();

    public  Customer infoCustomer() {
        System.out.println("Nhập id ");
        String id = scanner.nextLine();
        System.out.println("Nhập daybirth");
        String db = scanner.nextLine();
        System.out.println("Nhập gender");
        String gender = scanner.nextLine();
        System.out.println("Nhập id card");
        String idCard = scanner.nextLine();
        System.out.println("Nhập SĐT");
        String phone = scanner.nextLine();
        System.out.println("Nhâp email");
        String email = scanner.nextLine();
        System.out.println("Nhập id khách");
        String idEmployer = scanner.nextLine();
        System.out.println("Nhập loại khác");
        String type = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách:");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, db, gender, idCard, phone, email, idEmployer, type, address);
        return customer;
    }

    @Override
    public void displayListCustome() {
        for (Customer customer:customerList) {
            System.out.println(customer);
            System.out.println("Danh sách khách hàng");
        }
    }

    @Override
    public void addNewCustome() {
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        System.out.println("Thêm thành công");
    }

    @Override
    public void editCustome() {
        Customer customerEdit = this.findCustomer();
        if (customerEdit == null) {
            System.out.println("Không tìm thấy học sinh muốn sửa thông tin");
        } else {
            while (true) {
                int positionEdit = customerList.indexOf(customerEdit);
                System.out.print("Bạn muốn thay đổi thông tin gì?\n" +
                        "1. Tên khách hàng\n" +
                        "2. Id khách hàng\n" +
                        "3. Ngày sinh khách hàng\n" +
                        "4. Chứng minh thư\n" +
                        "5. phone number\n" +
                        "6. email\n" +
                        "7. địa chỉ \n" +
                        "8. kết thúc \n" +
                        "--> Xin mời nhập ở đây: ");
                String choiceEdit = scanner.nextLine();

                switch (choiceEdit) {
                    case "1":
                        System.out.println("Bạn muốn sửa tên lại như thế nào");
                        String newName = scanner.nextLine();
                        customerList.get(positionEdit).setName(newName);
                        System.out.println("Đã sửa tên thành công");
                        break;
                    case "2":
                        System.out.println("Bạn muốn sửa id lại như thế nào");
                        String newId = scanner.nextLine();
                        customerList.get(positionEdit).setIdCustomer(newId);
                        System.out.println("Đã sửa id thành công");
                        break;
                    case "3":
                        System.out.println("Bạn muốn sửa ngày sinh lại như thế nào");
                        String newBirthday = scanner.nextLine();
                        customerList.get(positionEdit).setDayBirth(newBirthday);
                        System.out.println("Đã sửa ngày sinh thành công");
                        break;
                    case "4":
                        System.out.println("Bạn muốn sửa chứng minh thư lại như thế nào");
                        String newPoint = scanner.nextLine();
                        customerList.get(positionEdit).setIdCard(newPoint);
                        System.out.println("Đã sửa chứng minh thành công");
                        break;
                    case "5":
                        System.out.println("Bạn muốn sửa phone lại như thế nào");
                        String phone = scanner.nextLine();
                        customerList.get(positionEdit).setNumberPhone(phone);
                        System.out.println("Đã sửa SDT thành công");
                        break;
                    case "6":
                        System.out.println("Bạn muốn sửa email lại như thế nào");
                        String email = scanner.nextLine();
                        customerList.get(positionEdit).setGender(email);
                        System.out.println("Đã sửa giới tính thành công");
                        break;
                    case "7":
                        System.out.println("Bạn muốn sửa địa chỉ lại như thế nào");
                        String address = scanner.nextLine();
                        customerList.get(positionEdit).setAddress(address);
                        System.out.println("Đã sửa giới tính thành công");
                        break;
                    case "8":
                        return;
                    default:
                        System.out.println("Số nhập vào không hợp lệ");
                }
            }
        }

    }
    public Customer findCustomer() {
        System.out.print("Nhập id học sinh bạn muốn thao tác: ");
        String findChoice = scanner.nextLine();

        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(findChoice)) {
                return customer;
            }
        }
        return null;
    }
}
