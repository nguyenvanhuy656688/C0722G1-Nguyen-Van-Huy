package controller;

import model.Customer;
import repository.impl_customer.CustomerRepository;
import service.impl_customer_service.CustomerService;
import service.impl_customer_service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static ICustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null)
            action ="";
        switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.deleteById(id);
        List<Customer> customerList = customerService.displayADelete();
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }


    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard") ;
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
        customerService.edit(customer);
        request.getRequestDispatcher("view/customer/edit.jsp");

    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard") ;
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
        customerService.create(customer);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
            action = "";
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
            default:
                list(request,response);
                break;
        }

    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.displayAll();
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("IdSearch"));
        List<Customer> customer = customerService.search(id);
        request.setAttribute("customerList",customer);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.showFormEdit(id);
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
}
