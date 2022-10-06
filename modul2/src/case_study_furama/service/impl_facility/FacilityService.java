package case_study_furama.service.impl_facility;

import case_study_furama.model.model_facility.Facility;
import case_study_furama.model.model_facility.House;
import case_study_furama.model.model_facility.Room;
import case_study_furama.model.model_facility.Villa;
import case_study_furama.ultis.FacilityException;


import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Facility> facilityList = new ArrayList<>();

    public static Villa infoVilla() throws FacilityException {
        String codeService;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ SVVL-XXXX");
                codeService = scanner.nextLine();
                if (!codeService.matches("SVVL[0-9]{4}")) {
                    throw new Exception("Nhập sai , nhập lại");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        String nameService;
        while (true) {
            try {
                System.out.println("Nhập tên dịch vụ:");
                nameService = scanner.nextLine();
                FacilityException.nameServiceCheck(nameService);
                break;
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        Double areaUsable;
        while (true) {
            try {
                try {
                    System.out.println("Diện tích sử dụng");
                    areaUsable = Double.parseDouble(scanner.nextLine());
                    FacilityException.areaUsable(areaUsable);
                    break;
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }

            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        Integer costRental ;
        while (true) {
            try {
                try {
                    System.out.println("Nhập chi phí thuê");
                    costRental = Integer.parseInt(scanner.nextLine());
                    FacilityException.costRental(costRental);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        Integer maximumPeople;
        while (true) {
            try {
                try {
                    System.out.println("Max người:");
                    maximumPeople = Integer.parseInt(scanner.nextLine());
                    FacilityException.maxPeople(maximumPeople);
                    break;
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            } catch (FacilityException e) {
                System.out.println(e.getMessage());
            }
        }

        String typeRental;
        while (true){
            try {
                System.out.println("Nhập loại thuê:");
                typeRental = scanner.nextLine();
                FacilityException.typeRental(typeRental);
                break;
            }catch (FacilityException e){
                System.out.println(e.getMessage());
            }
        }

        Integer standardRoom;
        while (true){
            try {
                try {
                    System.out.println("Nhập tiêu chuẩn phòng: 1-2-3");
                    standardRoom = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        Double areaPool;
        while (true){
            try {
                System.out.println("Nhập S hồ bơi");
                areaPool = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }

        Integer floorNumber;
        while (true){
            try {
                System.out.println("Nhập số tầng:");
                floorNumber = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }


        Villa villa = new Villa(codeService, nameService, areaUsable, costRental, maximumPeople, typeRental, standardRoom, areaPool, floorNumber);
        return villa;
    }

    public static House infoHouse() {
        String codeService;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ SVHO-XXXX");
                codeService = scanner.nextLine();
                if (!codeService.matches("SVHO[0-9]{4}")) {
                    throw new Exception("Nhập sai , nhập lại");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập tên dịch vụ:");
        String nameService = scanner.nextLine();
        System.out.println("Diện tích sử dụng");
        Double areaUsable = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập thuê");
        Integer costRental = Integer.parseInt(scanner.nextLine());
        System.out.println("Max người:");
        Integer maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại thuế:");
        String typeRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardRoom = scanner.nextLine();
        System.out.println("Nhập số tầng");
        String floorsNumber = scanner.nextLine();
        House house = new House(codeService, nameService, areaUsable, costRental, maximumPeople, typeRental, standardRoom, floorsNumber);
        return house;
    }

    public static Room infoRoom() {
        String codeService;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ SVRO-XXXX");
                codeService = scanner.nextLine();
                if (!codeService.matches("SVRO[0-9]{4}")) {
                    throw new Exception("Nhập sai , nhập lại");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập tên dịch vụ:");
        String nameService = scanner.nextLine();
        System.out.println("Diện tích sử dụng");
        Double areaUsable = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập thuê");
        Integer costRental = Integer.parseInt(scanner.nextLine());
        System.out.println("Max người:");
        Integer maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại thuê:");
        String typeRental = scanner.nextLine();
        System.out.println("Dịch vụ miễn phí:");
        String freeService = scanner.nextLine();
        Room room = new Room(codeService, nameService, areaUsable, costRental, maximumPeople, typeRental, freeService);
        return room;
    }

    @Override
    public void displayListMaintenance() {
        boolean flag = false;

        for (Facility facility : facilityMap.keySet()) {
            if (facilityMap.get(facility) == 5) {
                System.out.println("Bạn muốn thay đổi nhân viên, nhập Y nếu muốn");
                String wrap = scanner.nextLine();
                if (wrap.equals("Y")) {
                    facilityList.add(facility);
                    System.out.println("Đã thêm vào danh sách bảo trì");
                }
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("cái này Không có cần btr");
        }
        System.out.println("Danh sách bảo trì:" + facilityList);
    }

    @Override
    public void addVilla() throws FacilityException, IOException {
        facilityMap = readFileVilla();
        Villa villa = infoVilla();
        facilityMap.put(villa, 0);
        writeFileVilla(facilityMap);
        System.out.println("thêm thành c");
    }

    @Override
    public void addHouse() throws IOException {
        facilityMap = readFileHouse();
        House house = infoHouse();
        facilityMap.put(house, 0);
        writeFileHouse(facilityMap);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addRoom() throws IOException {
        facilityMap = readFileRoom();
        Room room = infoRoom();
        facilityMap.put(room, 0);
        writeFileRoom(facilityMap);
        System.out.println("Thêm thành công");
    }

    @Override
    public void displayList() {
        for (Facility key : facilityMap.keySet()) {
            Integer value = facilityMap.get(key);
            System.out.println(key + "," + value);
        }
    }

    private Map<Facility,Integer> readFileHouse() throws IOException {
        File file = new File("src\\case_study_furama\\data\\house.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<Facility,Integer> houseList = new LinkedHashMap<>();
        String line;
        String[] arr;
        House house;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            house=new House(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], arr[7]);
            houseList.put(house,0);
        }
        bufferedReader.close();
        return houseList;
    }

    public void writeFileHouse(Map<Facility, Integer> facilityIntegerMap) throws IOException {
        File file = new File("src\\case_study_furama\\data\\house.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> houseSet = facilityIntegerMap.keySet();
        for (Facility key : houseSet) {
            bufferedWriter.write(getHouse((House) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private Map<Facility,Integer> readFileRoom() throws IOException {
        File file = new File("src\\case_study_furama\\data\\room.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<Facility,Integer> roomList = new LinkedHashMap<>();
        String line;
        String[] arr;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
            roomList.put(room,0);
        }
        bufferedReader.close();
        return roomList;
    }

    public void writeFileRoom(Map<Facility, Integer> facilityIntegerMap) throws IOException {
        File file = new File("src\\case_study_furama\\data\\room.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> houseSet = facilityIntegerMap.keySet();
        for (Facility key : houseSet) {
            bufferedWriter.write(getRoom((Room) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


    private Map<Facility,Integer> readFileVilla() throws IOException {
        File file = new File("src\\case_study_furama\\data\\villa.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<Facility,Integer> roomList = new LinkedHashMap<>();
        String line;
        String[] arr;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
            roomList.put(room,0);
        }
        bufferedReader.close();
        return roomList;
    }

    public void writeFileVilla(Map<Facility, Integer> facilityIntegerMap) throws IOException {
        File file = new File("src\\case_study_furama\\data\\villa.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Facility> villaSet = facilityIntegerMap.keySet();
        for (Facility key : villaSet) {
            bufferedWriter.write(getVilla((Villa) key));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public String getVilla(Villa villa) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", villa.getCodeService(), villa.getNameService(), villa.getAreaUsable(), villa.getCostRental(), villa.getMaximumPeople(), villa.getTypeRental(), villa.getStandardRoom(), villa.getAreaPool(), villa.getFloorNumber());
    }

    public String getRoom(Room villa) {
        return String.format("%s,%s,%s,%s,%s,%s,%s", villa.getCodeService(), villa.getNameService(), villa.getAreaUsable(), villa.getCostRental(), villa.getMaximumPeople(), villa.getTypeRental(), villa.getFreeService());
    }

    public String getHouse(House villa) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", villa.getCodeService(), villa.getNameService(), villa.getAreaUsable(), villa.getCostRental(), villa.getMaximumPeople(), villa.getTypeRental(), villa.getStandardRoom(), villa.getFloorsNumber());
    }
}
