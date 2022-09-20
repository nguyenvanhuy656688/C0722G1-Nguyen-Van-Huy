package mvc2.service.implOto;

import mvc2.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    static Scanner scanner = new Scanner(System.in);
    static List<Oto> otoList = new ArrayList<>();

    public Oto infoOto() {
        System.out.print("Mời bạn nhập biển kiểm soát: ");
        int seaController = Integer.parseInt(scanner.nextLine());
        List<String> manufacturer = new ArrayList<>();
        String code = "HN_123";
        String name = "Honda";
        String nation = "Việt Nam";
        manufacturer.add(code);
        manufacturer.add(name);
        manufacturer.add(nation);
        System.out.print("Mời bạn nhập năm sản xuất: ");
        int yearManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Mời bạn kiểu xe ");
        String type = scanner.nextLine();
        System.out.print("Mời bạn nhập số chỗ ngồi");
        int numberSeats = Integer.parseInt(scanner.nextLine());
        Oto oto = new Oto(seaController, manufacturer, yearManufacture, owner, numberSeats, type);
        return oto;
    }

    @Override
    public void addOto() {
        Oto oto = this.infoOto();
        otoList.add(oto);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void displayAllOto() {
        for (Oto oto : otoList) {
            System.out.println(oto);
        }
    }

    @Override
    public void removeOto() {
        System.out.println("Mời bạn chủ xe cần xóa");
        String owner = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).getOwner().equals(owner)){
                System.out.println("Bạn có muốn xóa không yes-no");
                String choose = scanner.nextLine();
                if(choose.equals("yes")){
                    otoList.remove(i);
                    System.out.println("Đã xóa");
                }
                flag = true;

            }
        }
        if(!flag){
            System.out.println("Không thấy đối tượng cần xóa");
        }

    }

    @Override
    public void searchOto() {
        System.out.println("Mời bạn chủ của ô tô cần tìm");
        String  owner = scanner.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).getOwner().equals(owner)) {
                System.out.println(otoList);
            }
        }
    }

    @Override
    public void editOto() {

    }
}
