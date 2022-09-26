package mvc.service.implStudent;

import mvc.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    static Scanner scanner = new Scanner(System.in);
    private static List<mvc.model.Student> studentList = new ArrayList<>();

    public mvc.model.Student infoStudent() throws StudentException {
        String code;
        while (true) {
            try {
                System.out.print("Mời bạn nhập mã học sinh: ");
                code = scanner.nextLine();
                if(!code.matches("[a-zA-Z0-9]{3,6}"))
                    throw new StudentException("Nhập sai");
                break;
            } catch (Exception e) {
                System.out.println("Bạn nhập sai r, mời nhập lại");
                e.getStackTrace();
            }
        }
        String name;
        while (true){
            try {
                System.out.print("Mời bạn nhập tên học sinh: ");
                name = scanner.nextLine();
                if(!code.matches("[a-zA-Z0-9]{3,6}"))
                    throw new StudentException("Nhập sai");
                break;
            }catch (Exception e){
                System.out.println("Bạn nhập sai r , mời nhập lại");
                e.getStackTrace();
            }
        }
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String tempGender = scanner.nextLine();
        Boolean gender = null;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        }
        if (tempGender.equals("") || tempGender.equals("LGBT")) {
            gender = true;
            System.out.println("Gioi tinh 3");
        }
        String nameClass;
        while (true){
            try {
                System.out.print("Mời bạn nhập tên lớp: ");
                 nameClass = scanner.nextLine();
                 break;
            }catch (Exception e){
                System.out.println("Mời nhập lại");
                e.getStackTrace();
            }
        }
        double score;
        while (true){
            try {
                System.out.print("Mời bạn nhập điểm của học sinh: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score>9.9 || score<0){
                    throw new StudentException("Đã nhập sai");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("sai định dạng , nhập lại!");
                e.getStackTrace();
            }
        }
        int dayBirth;
        while (true){
            try {
                System.out.print("Mời bạn nhập ngày sinh:");
                dayBirth= Integer.parseInt(scanner.nextLine());
                if (dayBirth>31 || dayBirth<1){
                    throw new StudentException("Đã nhập sai");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("sai ngày , mời nhập lại");
            }
        }

        mvc.model.Student student = new mvc.model.Student(code, name, gender, dayBirth, nameClass, score);
        return student;
    }

    public void displayAllStudent() {
        for (mvc.model.Student student : studentList) {
            System.out.println(student);
        }
    }

    public void addStudent() throws StudentException{
        mvc.model.Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    public void removeStudent() {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("Mời bạn nhập sinh viên cần tìm");
        String studentT = scanner.nextLine();
        System.out.println("Mời bạn nhập id cần tìm");
        String id = scanner.nextLine();
        for (mvc.model.Student student : studentList) {
            if (student.getName().contains(studentT) || student.getCode().equals(id)) {
                System.out.println(student);
            }
        }

    }

    @Override
    public void editStudent() {
        Student studentEdit = this.findStudent1();
        if (studentEdit == null) {
            System.out.println("Không tìm thấy học sinh muốn sửa thông tin");
        } else {
            while (true) {
                int positionEdit = studentList.indexOf(studentEdit);
                System.out.print("Bạn muốn thay đổi thông tin gì?\n" +
                        "1. Tên học sinh\n" +
                        "2. Id học sinh\n" +
                        "3. Ngày sinh học sinh\n" +
                        "4. Điểm học sinh\n" +
                        "5. Tên lớp học sinh\n" +
                        "6. Giới tính\n" +
                        "7. Kết thúc\n" +
                        "--> Xin mời nhập ở đây: ");
                int choiceEdit = Integer.parseInt(scanner.nextLine());

                switch (choiceEdit) {
                    case 1:
                        System.out.println("Bạn muốn sửa tên học sinh lại như thế nào");
                        String newName = scanner.nextLine();
                        studentList.get(positionEdit).setName(newName);
                        System.out.println("Đã sửa tên thành công");
                        break;
                    case 2:
                        System.out.println("Bạn muốn sửa id học sinh lại như thế nào");
                        String newId = scanner.nextLine();
                        studentList.get(positionEdit).setCode(newId);
                        System.out.println("Đã sửa id thành công");
                        break;
                    case 3:
                        System.out.println("Bạn muốn sửa ngày sinh học sinh lại như thế nào");
                        int newBirthday = Integer.parseInt(scanner.nextLine());
                        studentList.get(positionEdit).setDateBirth(newBirthday);
                        System.out.println("Đã sửa ngày sinh thành công");
                        break;
                    case 4:
                        System.out.println("Bạn muốn sửa điểm học sinh lại như thế nào");
                        double newPoint = Double.parseDouble(scanner.nextLine());
                        studentList.get(positionEdit).setScore(newPoint);
                        System.out.println("Đã sửa điểm thành công");
                        break;
                    case 5:
                        System.out.println("Bạn muốn sửa tên lớp lại như thế nào");
                        String newClassname = scanner.nextLine();
                        studentList.get(positionEdit).setNameClass(newClassname);
                        System.out.println("Đã sửa tên lớp thành công");
                        break;
                    case 6:
                        System.out.println("Bạn muốn sửa giới tính lại như thế nào");
                        boolean newGender = Boolean.parseBoolean(scanner.nextLine());
                        studentList.get(positionEdit).setGender(newGender);
                        System.out.println("Đã sửa giới tính thành công");
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("Số nhập vào không hợp lệ");
                }
            }
        }
    }

    public Student findStudent1() {
        System.out.print("Nhập id học sinh bạn muốn thao tác: ");
        String findChoice = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getCode().equals(findChoice)) {
                return student;
            }
        }
        return null;
    }


    @Override
    public void sortStudent() {
        System.out.println("Nhâp tên cần sắp xếp: ");
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) > 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(j - 1, temp);
                } else if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) == 0) {
                    System.out.println("ok");
                    if (studentList.get(j).getCode().compareTo(studentList.get(j - 1).getCode()) > 0) {
                        System.out.println("ok");
                        Student temp1 = studentList.get(j);
                        studentList.set(j, studentList.get(j - 1));
                        studentList.set(j - 1, temp1);
                    }
                }
            }
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
