package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FacilityServlet" ,value = "facility")
public class FacilityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
    }
}
