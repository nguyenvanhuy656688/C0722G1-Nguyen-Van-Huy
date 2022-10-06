package case_study_furama.service.impl_employer;

import case_study_furama.model.model_facility.Villa;
import case_study_furama.model.model_person.Customer;
import case_study_furama.model.model_person.Employer;
import case_study_furama.ultis.PersonException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployerService implements IEmployerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employer> employerList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Employer infoEmployer(){

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

        String idCustomer;
        while (true) {
            try {
                System.out.println("Nhập id nhân viênn AXXXX vs X là số");
                idCustomer = scanner.nextLine();
                PersonException.idCustomerCheck(idCustomer);
                break;
            } catch (PersonException e) {
                System.out.println("Nhập sai, nhập lại");
            }
        }
        System.out.println("Nhập trình độ:");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí đảm nhiệm");
        String locus = scanner.nextLine();
        System.out.println("Nhập lương:");
        String wage = scanner.nextLine();
        Employer employer = new Employer(name,dateOfBirth,gender,idCard,phone,email,idCustomer,level,locus,wage);
        return employer;
    }


    @Override
    public void displayList() throws IOException {
        employerList = readFile();
        for (Employer employer:employerList) {
            System.out.println(employer);
        }
        System.out.println("Danh sách nhân viên!");
    }

    @Override
    public void addEmployer() throws IOException {
        employerList = readFile();
        Employer employer = this.infoEmployer();
        employerList.add(employer);
        writeFile(employerList);
        System.out.println("Thêm nhân viên thành công");
    }

    @Override
    public void editEmployer() throws IOException {
        employerList = readFile();
        System.out.println("Nhập vào id cần thay đổi:");
        String id = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < employerList.size(); i++) {
            if(employerList.get(i).getIdEmployer().equals(id)){
                System.out.println("Bạn muốn thay đổi nhân viên:");
                System.out.println("Chọn Y nếu muốn thay đổi");
                String choose = scanner.nextLine();
                if(choose.equals("Y")){
                    employerList.set(i,infoEmployer());
                }
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Không tìm thấy id cần thay đổi:");
        }else {
            writeFile(employerList);
            System.out.println("đã thay đổi nhân viên");
        }
    }

    private List<Employer> readFile() throws IOException {
        File file = new File("src\\case_study_furama\\data\\employer.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Employer> employerList = new ArrayList<>();
        String line;
        String[] arr;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            employerList.add(new Employer(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5],arr[6],arr[7],arr[8],arr[9]));
        }
        bufferedReader.close();
        return employerList;
    }

    public void writeFile(List<Employer> customerList) throws IOException {
        File file = new File("src\\case_study_furama\\data\\employer.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Employer employer : employerList) {
            bufferedWriter.write(getInfo(employer));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getInfo(Employer employer) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", employer.getName(),employer.getDayBirth(),employer.getGender(),employer.getIdCard(),employer.getNumberPhone(),employer.getEmail(),employer.getIdEmployer(),employer.getLevel(),employer.getLocus(),employer.getWage());
    }
}
