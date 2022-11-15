package controller;

import model.Customer;
import model.Employer;
import service.impl_employer_service.EmployerService;
import service.impl_employer_service.IEmployerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployerServlet", value = "/employer")
public class EmployerServlet extends HttpServlet {
    private static IEmployerService employerService = new EmployerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employerService.deleteById(id);
        List<Employer> employerList = employerService.displayADelete();
        request.setAttribute("customerList", employerList);

        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }


    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int division = Integer.parseInt(request.getParameter("division"));
        String username = request.getParameter("username");

        Employer customer = new Employer(id, customerTypeId, name, dateOfBirth, gender, idCard, phoneNumber, email,
                address,position,educationDegreeId,division,username);
        boolean check = employerService.edit(customer);
        String message = "Edit No Success";
        if (check) {
            message = "Edit Success";
        }
        request.setAttribute("message", message);
        try {
            request.getRequestDispatcher("view/employer/edit.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int division = Integer.parseInt(request.getParameter("division"));
        String username = request.getParameter("username");
        Employer customer = new Employer(customerTypeId, name, dateOfBirth, gender, idCard, phoneNumber, email, address,
                position,educationDegreeId,division,username);
        employerService.create(customer);
        try {
            request.getRequestDispatcher("view/employer/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "search":
                search(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                list(request, response);
                break;
        }

    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Employer> employerList = employerService.displayAll();
        request.setAttribute("customerList", employerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("IdSearch"));
        List<Employer> employers = employerService.search(id);
        request.setAttribute("customerList", employers);
        try {
            request.getRequestDispatcher("view/employer/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employer customer = employerService.findById(id);
        request.setAttribute("customer", customer);
        try {
            request.getRequestDispatcher("view/employer/edit.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }


    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/employer/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}

