package case_study_furama.service.impl_employer;

import case_study_furama.model.model_person.Employer;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployerService implements IEmployerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employer> employerList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("xx/MM/yyyy");

    public Employer infoEmployer(){
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String datebirth = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập chứng minh thư:");
        String idCard = scanner.nextLine();
        System.out.println("Nhập SDT:");
        String phone = scanner.nextLine();
        System.out.println("Nhập email:");
        String email =scanner.nextLine();
        System.out.println("Nhập id nhân viên:");
        String idEmployer = scanner.nextLine();
        System.out.println("Nhập trình độ:");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí đảm nhiệm");
        String locus = scanner.nextLine();
        System.out.println("Nhập lương:");
        String wage = scanner.nextLine();
        Employer employer = new Employer(name,datebirth,gender,idCard,phone,email,idEmployer,level,locus,wage);
        return employer;
    }


    @Override
    public void displayList() {
        for (Employer employer:employerList) {
            System.out.println(employer);
        }
        System.out.println("Danh sách nhân viên!");
    }

    @Override
    public void addEmployer() {
        Employer employer = this.infoEmployer();
        employerList.add(employer);
        System.out.println("Thêm nhân viên thành công");

    }

    @Override
    public void editCustome() {
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
                    System.out.println("Đã thay đổi nhân viên");
                }
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Không tìm thấy id cần thay đổi:");
        }else {
            System.out.println("đã thay đổi nhân viên");
        }
    }
}
