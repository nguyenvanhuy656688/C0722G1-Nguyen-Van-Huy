package controller;

import model.Facility;
import service.facility.FacilityService;
import service.facility.IFacilityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FacilityServlet" ,value = "/facility")
public class FacilityServlet extends HttpServlet {
    static IFacilityService iFacilityService = new FacilityService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action== null){
            action="";
        }switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            default:
                list(request,response);
                break;
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = iFacilityService.list();
        request.setAttribute("facilityList",facilityList);
        try {
            request.getRequestDispatcher("view/facility/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
    }
}
