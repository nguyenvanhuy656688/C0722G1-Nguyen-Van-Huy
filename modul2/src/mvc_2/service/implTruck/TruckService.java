package mvc2.service.implTruck;

import mvc2.model.Oto;
import mvc2.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    static Scanner scanner = new Scanner(System.in);
    static List<Truck> truckList = new ArrayList<>();

    public Truck infoTruck() {
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
        System.out.print("Mời bạn nhập tải trọng xe ");
        String tonnage = scanner.nextLine();
        Truck truck = new Truck(seaController, manufacturer, yearManufacture, owner, tonnage);
        return truck;
    }

    @Override
    public void addExpediency() {
        Truck truck = this.infoTruck();
        truckList.add(truck);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void displayAllExpediency() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void removeExpediency() {
        System.out.println("Mời bạn chủ xe cần xóa");
        String owner = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getOwner().equals(owner)) {
                System.out.println("Bạn có muốn xóa không yes-no");
                String choose = scanner.nextLine();
                if (choose.equals("yes")) {
                    truckList.remove(i);
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
    public void searchExpediency() {
        System.out.println("Mời bạn chủ của ô tô cần tìm");
        String owner = scanner.nextLine();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getOwner().equals(owner)) {
                System.out.println(truckList);
            }
        }
    }

    @Override
    public void editExpediency() {

    }
}
