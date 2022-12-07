package controller;

import model.Employee;
import service.employee.EmployeeService;
import service.employee.IEmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    static IEmployeeService iEmployeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action== null){
            action="";
        }switch (action){
            case "create":
                create(request,response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String idCard = request.getParameter("idCard");
        String salary = request.getParameter("salary");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String educationDegreeId = request.getParameter("educationDegreeId");
        String division = request.getParameter("division");
        String username = request.getParameter("username");
        Employee employee = new Employee( name, dateOfBirth ,idCard,salary, phoneNumber, email, address,
                position,educationDegreeId,division,username);
        boolean check  = iEmployeeService.create(employee);
        String mess = "Thêm mới thành công";
        if(!check){
            mess = "Thêm mới không thành công";
        }
        request.setAttribute("mess",mess);
        try {
            request.getRequestDispatcher("view/employer/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            default:
                list(request,response);
                break;
        }

    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = iEmployeeService.list();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("view/employee/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/employee/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
