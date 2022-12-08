package controller;

import model.Customer;
import service.customer.CustomerService;
import service.customer.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet" , value = "/customer")
public class CustomerServlet extends HttpServlet {
    static ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action== null){
            action ="";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String customerType = request.getParameter("customerType");
        String name = request.getParameter("name");
        String dateOfBirth =request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard") ;
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,name,dateOfBirth,gender,idCard,phoneNumber,email,address,customerType);
        boolean check = iCustomerService.edit(customer);
        String mess = "Chỉnh sửa thành công";
        if (!check){
            mess = "Chỉnh sửa không thành công";
        }
        request.setAttribute("mess",mess);
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
         String customerType = request.getParameter("customerType");
         String name = request.getParameter("name");
         String dateOfBirth =request.getParameter("dateOfBirth");
         boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
         String idCard = request.getParameter("idCard") ;
         String phoneNumber = request.getParameter("phoneNumber");
         String email = request.getParameter("email");
         String address = request.getParameter("address");
         Customer customer = new Customer(name,dateOfBirth,gender,idCard,phoneNumber,email,address,customerType);
         boolean check = iCustomerService.create(customer);
         String mess = "Thêm mới thành công";
         if (!check){
             mess = "Thêm mới không thành công";
         }
         request.setAttribute("mess",mess);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                list(request,response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean check = iCustomerService.delete(id);
        String mess1 = "Đã xóa";
        if(!check){
            mess1 = "Xóa không thành công";
        }
        List<Customer> customerList = iCustomerService.displayAll();
        request.setAttribute("customerList",customerList);
        request.setAttribute("mess1", mess1);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        int idSearch = Integer.parseInt(request.getParameter("id"));
        String nameSearch = request.getParameter("name");
        String addressSearch = request.getParameter("address");
        List<Customer> customerList = iCustomerService.search(idSearch,nameSearch,addressSearch);
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.editById(id);
        request.setAttribute("customer",customer);
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = iCustomerService.displayAll();
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
