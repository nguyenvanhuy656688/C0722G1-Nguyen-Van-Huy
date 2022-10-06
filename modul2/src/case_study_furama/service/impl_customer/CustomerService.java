package case_study_furama.service.impl_customer;

import case_study_furama.model.model_facility.Villa;
import case_study_furama.model.model_person.Customer;
import case_study_furama.ultis.PersonException;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Customer infoCustomer() {
        String name;
        while (true) {
            try {
                System.out.println("Nhập tên khách");
                name = scanner.nextLine();
                PersonException.nameCheck(name);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai, mời nhập lại");
            }
        }

        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.println("Nhập ngày tháng năm khách hàng");
                dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                PersonException.customerAgeCheck(dateOfBirth);
                break;
            } catch (PersonException e) {
                System.out.println(e.getMessage());
            }
        }
        String gender;
        while (true) {
            try {
                System.out.println("Nhập gender: Nam or Nữ , nam or nữ");
                gender = scanner.nextLine();
                PersonException.genderCheck(gender);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai, mời nhập lại");
            }
        }

        String idCard;
        while (true) {
            try {
                System.out.println("Nhập id card");
                idCard = scanner.nextLine();
                PersonException.idCardCheck(idCard);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
        String phone;
        while (true) {
            try {
                System.out.println("Nhập SĐT");
                phone = scanner.nextLine();
                PersonException.phoneCheck(phone);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai, mời nhập lại");
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("Nhâp email");
                email = scanner.nextLine();
                PersonException.emailCheck(email);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai r, mời nhập lại");
            }
        }

        String idEmployer;
        while (true) {
            try {
                System.out.println("Nhập id khách BXXXX vs X là số");
                idEmployer = scanner.nextLine();
                PersonException.idEmployerCheck(idEmployer);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai, nhập lại");
            }
        }

        String type;
        while (true) {
            try {
                System.out.println("Nhập loại khách");
                type = scanner.nextLine();
                if (!type.matches("(VIP|Normal)")) {
                    throw new Exception("Nhập sai r, nhập lại");
                }
                System.out.println("Nhập thành công");
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai r, nhập lại");
            }
        }

        System.out.println("Nhập địa chỉ khách:");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, dateOfBirth, gender, idCard, phone, email, idEmployer, type, address);
        return customer;
    }

    @Override
    public void displayListCustome() throws IOException {
        customerList = readFile();
        for (Customer customer : customerList) {
            System.out.println(customer);
            System.out.println("Danh sách khách hàng");
        }
    }

    @Override
    public void addNewCustome() throws IOException {
        customerList = readFile();
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        writeFile(customerList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void editCustome() throws IOException {
        customerList = readFile();
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
                        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                        customerList.get(positionEdit).setDayBirth(dateOfBirth);
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

    private List<Customer> readFile() throws IOException {
        File file = new File("src\\case_study_furama\\data\\customer.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Customer> customerList = new ArrayList<>();
        String line;
        String[] arr;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            customerList.add(new Customer(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5],arr[6],arr[7],arr[8]));
        }
        bufferedReader.close();
        return customerList;
    }

    public void writeFile(List<Customer> customerList) throws IOException {
        File file = new File("src\\case_study_furama\\data\\customer.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Customer customer : customerList) {
            bufferedWriter.write(getInfo(customer));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Customer customer) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", customer.getName(),customer.getDayBirth(),customer.getGender(),customer.getIdCard(),customer.getNumberPhone(),customer.getEmail(),customer.getIdCustomer(),customer.getTypeCustomer(),customer.getAddress());
    }
}
