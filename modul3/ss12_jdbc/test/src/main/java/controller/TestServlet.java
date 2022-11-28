package controller;

import model.Test;
import reponsitory.TestRepository;
import service.ITestService;
import service.TestService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TestServlet", urlPatterns = "/test")


public class TestServlet extends HttpServlet {
    private static ITestService iTestService = new TestService();

    /* Dùng để tạo biến liên kết vs repository */
    private  static TestRepository testRepository  ;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* getParameter: Trích xuất định danh*/
        String action = request.getParameter("action");
        if(action ==  null){
            action = "";
        }
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
            default:

        }
    }
    private void create(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        Test test = new Test(name,email,country);
        testRepository.create(test);
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        Test test = new Test(id,name,email,country);
        testRepository.edit(test);
        try {
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        /* Xóa theo id */
        testRepository.delete(id);
        List<Test> listADelete = testRepository.displayAllAfterDelete();
        /* thay đổi tên list để gửi đến jsp */
        request.setAttribute("ListADelete",listADelete);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
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
            default:
                list(request,response);
                break;
        }

    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Test> testList = testRepository.displayList();
        request.setAttribute("list",testList);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        /*Tìm kiếm = email */
        String email = request.getParameter("email");
        Test email1 = iTestService.searchByEmail(email);
        request.setAttribute("search",email);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }


    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        testRepository.showFormEdit(id);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/view/edit.jsp");
        request.setAttribute("display",requestDispatcher);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
