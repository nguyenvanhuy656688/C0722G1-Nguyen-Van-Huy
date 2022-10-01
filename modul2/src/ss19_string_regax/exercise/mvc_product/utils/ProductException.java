package ss19_string_regax.exercise.mvc_product.utils;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
    public static void nameCheck(String name) throws ProductException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{1,5}")) {
                throw new ProductException("Tên không khớp chuẩn tiếng Việt, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public static void idCheck(String id) throws ProductException{
        if(!id.matches("[ABC]{1}[0-9]{4}")){
            throw new ProductException("ID không khớp , mời nhập lại");
        }
        System.out.println("Nhập id thành công");
    }

    public static void expiryCheck(LocalDate date, DateTimeFormatter formatter) throws ProductException {
        if(date.equals(formatter)){
            System.out.println("Nhập đúng định dạng");
        }else {
            throw new ProductException("Nhập sai định dạng");
        }
    }
}
