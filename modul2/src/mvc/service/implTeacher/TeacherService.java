package mvc.service.implTeacher;

import mvc.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    public Teacher infoTeacher() {
        System.out.print("Mời bạn nhập mã giáo viên: ");
        String code = scanner.nextLine();
        System.out.print("Mời bạn nhập tên giáo viên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính giáo viên: ");
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
        System.out.println("Mời bạn nhập ngày sinh");
        int dayBirth = scanner.nextInt();
        System.out.println("Mời bạn chuyên nghành");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(code, name, gender,dayBirth, specialize);
        return teacher;
    }

    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
    }

    public void removeTeacher() {
        System.out.print("Mời bạn nhập mã giáo viên cần xóa: ");
        String code = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
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
    public void searchTeacher() {
        System.out.println("Mời bạn nhập sinh viên cần tìm");
        String studentT = scanner.nextLine();
        System.out.println("Mời bạn nhập id cần tìm");
        String id = scanner.nextLine();
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(studentT) || teacher.getCode().equals(id)) {
                System.out.println(teacher);
            }
        }

    }

    @Override
    public void editTeacher() {
        System.out.println("Mời bạn nhập id sinh viên  cần edit");
        String id = scanner.nextLine();
        int choice;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().equals(id)) {
                System.out.println("Sinh viên bạn muốn edit là" + teacherList.get(i).getName());
                System.out.println("__");
                ;
                System.out.println("Bạn muốn thay đổi gì");
                System.out.println("1.thay đổi id");
                System.out.println("2.thay đổi Tên");
                System.out.println("3.thay đổi Gioi tinh");
                System.out.println("4.thay đổi ngày sinh");
                System.out.println("5.thay đổi chuyên nghành");
                System.out.println("6.exit");
                System.out.println("________");
                System.out.println("Mời bạn nhập thông tin cần thay đổi");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        String editId = scanner.nextLine();
                        teacherList.get(choice - 1).setCode(editId);
                        break;
                    case 2:
                        String editName = scanner.nextLine();
                        teacherList.get(choice - 1).setName(editName);
                        break;
                    case 3:
                        Boolean editGender = scanner.nextBoolean();
                        teacherList.get(choice - 1).setGender(editGender);
                        break;
                    case 4:
                        int dayBirth = scanner.nextInt();
                        teacherList.get(choice - 1).setDateBirth(dayBirth);
                        break;
                    case 5:
                        String specialize = scanner.nextLine();
                        teacherList.get(choice-1).setSpecialize(specialize);
                    case 6:
                        System.exit(6);
                    default:
                        System.out.println("Không tìm thấy sinh viên cần edit");
                }
            }
            break;
        }
    }

}
