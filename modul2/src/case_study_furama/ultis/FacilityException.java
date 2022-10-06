package case_study_furama.ultis;

import case_study_furama.model.model_facility.Facility;

public class FacilityException extends Exception {
    public FacilityException(String message) {
        super(message);
    }

    public static void nameServiceCheck(String name) throws FacilityException {
        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-Z][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{2,}")) {
                throw new FacilityException("Tên không khớp chuẩn, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }


    public static void areaUsable(Double area) throws FacilityException {
        if(area<30.0){
            throw new FacilityException("Không đúng diện tích");
        }
        System.out.println("Nhập dữ liệu thành công");

    }

    public static void costRental(Integer cos) throws FacilityException {
        if(cos<0){
            throw new FacilityException("Nhập lại mức phí");
        }
        System.out.println("Nhập thành công");

    }

    public static void maxPeople(Integer max) throws FacilityException {
        if(max<0 || max >20){
            throw new FacilityException("Qúa số lượng người");
        }
        System.out.println("Nhập thành công");
    }

    public static void typeRental(String type) throws FacilityException {
        String []arr = type.trim().split(" ");
        for (String s:arr) {
            if(!s.matches("[A-Za-z0-9]{2,}")){
                throw new FacilityException("Sai định dạng thuế, mời nhập lại");
            }
            System.out.println("Nhập thành công");
        }
    }
}
