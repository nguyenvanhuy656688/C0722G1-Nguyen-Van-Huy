import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    private  static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("Huy","20/11/2000","111 Hà Long","https://thpt-phamhongthai.edu.vn/wp-content/uploads/2022/07/1640841264_102_hinh-nen-girl-xinh-full-hd-cho-laptop-va-may.jpg"));
        customers.add(new Customer("Huy","20/11/2000","111 Hà Long","https://thpt-phamhongthai.edu.vn/wp-content/uploads/2022/07/1640841264_102_hinh-nen-girl-xinh-full-hd-cho-laptop-va-may.jpg"));
        customers.add(new Customer("Huy","20/11/2000","111 Hà Long","https://thpt-phamhongthai.edu.vn/wp-content/uploads/2022/07/1640841264_102_hinh-nen-girl-xinh-full-hd-cho-laptop-va-may.jpg"));
        customers.add(new Customer("Huy","20/11/2000","111 Hà Long","https://thpt-phamhongthai.edu.vn/wp-content/uploads/2022/07/1640841264_102_hinh-nen-girl-xinh-full-hd-cho-laptop-va-may.jpg"));
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("customers",customers);
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }
}
