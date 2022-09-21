package ss12_java_collection_framework.exercise.mvc.service;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ss12_java_collection_framework.exercise.mvc.model.Orange;

import java.util.*;

public class OrangeService implements IOrangeService {
    static Scanner scanner = new Scanner(System.in);
    List<Orange> orangeList = new ArrayList<>();


    public Orange infoOrange() {
        System.out.print("Mã trái cây: ");
        Integer number = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn nhập khối lượng: ");
        String mass = scanner.nextLine();

        System.out.print("Mời bạn nhập giá: ");
        String price = scanner.nextLine();

        System.out.print("Mời bạn nhập nguồn gốc: ");
        String source = scanner.nextLine();

        System.out.print("Mời bạn nhập màu: ");
        String color = scanner.nextLine();

        System.out.print("Mời bạn nhập vị:");
        String taste = scanner.nextLine();
        if (taste.contains("ọt")) {
            System.out.println(taste);
        } else {
            System.out.println("bạn nhập sai vị rồi");
            taste = null;
        }

        Orange orange = new Orange(number, mass, price, source, color, taste);
        return orange;
    }


    @Override
    public void addOrange() {
        Orange orange = this.infoOrange();
        orangeList.add(orange);
        System.out.println("Bạn đã thêm mới thành công");
    }

    @Override
    public void displayOrange() {
        for (Orange orange : orangeList) {
            System.out.println(orange);
        }
        System.out.println("Danh sách hiển thị!");
    }

    @Override
    public void removeOrange() {
        System.out.println("Mời bạn mã cam cần xóa");
        Integer numcode = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < orangeList.size(); i++) {
            if (orangeList.get(i).getNumber().equals(numcode)) {
                System.out.println("Bạn có muốn xóa không yes-no");
                String choose = scanner.nextLine();
                if (choose.equals("yes")) {
                    orangeList.remove(i);
                    System.out.println("Đã xóa");
                }
                flag = true;

            }
        }
        if (!flag) {
            System.out.println("Không thấy đối tượng cần xóa");
        }

    }

    @Override
    public void findOrange() {
        System.out.println("Mời bạn giá cam cần tìm");
        String price = scanner.nextLine();
        for (int i = 0; i < orangeList.size(); i++) {
            if (orangeList.get(i).getPrice().equals(price)) {
                System.out.println(orangeList);
                System.out.println("Đã tìm thấy");
                break;
            }
        }
    }

    @Override
    public void sortOrange() {
        System.out.print("Bạn muốn sắp xếp tăng hay giảm\n" +
                "1.Tăng dần\n" +
                "2.Giam dần\n" +
                "--->Mời bạn chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                Collections.sort(orangeList, new Comparator<Orange>() {
                    @Override
                    public int compare(Orange o1, Orange o2) {
                        if (o1.getNumber() > o2.getNumber()) {
                            return 1;
                        } else if (o1.getNumber() < o2.getNumber()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                });
                for (Orange product : orangeList) {
                    System.out.println(product.toString());
                }
                break;
            case 2:
                Collections.sort(orangeList, new Comparator<Orange>() {
                    @Override
                    public int compare(Orange o1, Orange o2) {
                        if (o1.getNumber() > o2.getNumber()) {
                            return -1;
                        } else if (o1.getNumber() < o2.getNumber()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                for (Orange product : orangeList) {
                    System.out.println(product.toString());
                }
                break;
        }
    }
}


