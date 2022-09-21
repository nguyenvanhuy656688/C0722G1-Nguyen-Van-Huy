package mvc2.service.implMotorcycle;

import mvc2.model.Motorcycle;
import mvc2.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    static Scanner scanner = new Scanner(System.in);
    static List<Motorcycle> motorcycleList = new ArrayList<>();

    public Motorcycle infoExpediency() {
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
        System.out.print("Mời bạn nhập công suất xe ");
        String wattage = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(seaController, manufacturer, yearManufacture, owner,wattage );
        return motorcycle;
    }

    @Override
    public void addExpediency() {
        Motorcycle motorcycle = this.infoExpediency();
        motorcycleList.add(motorcycle);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void displayAllExpediency() {
        for (Motorcycle motorcycle : motorcycleList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void removeExpediency() {
        System.out.println("Mời bạn chủ xe cần xóa");
        String owner = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < motorcycleList.size(); i++) {
            if (motorcycleList.get(i).getOwner().equals(owner)){
                System.out.println("Bạn có muốn xóa không yes-no");
                String choose = scanner.nextLine();
                if(choose.equals("yes")){
                    motorcycleList.remove(i);
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
    public void searchExpediency() {
        System.out.println("Mời bạn chủ của ô tô cần tìm");
        String  owner = scanner.nextLine();
        for (int i = 0; i < motorcycleList.size(); i++) {
            if (motorcycleList.get(i).getOwner().equals(owner)) {
                System.out.println(motorcycleList);
            }
        }
    }

    @Override
    public void editExpediency() {

    }
}
