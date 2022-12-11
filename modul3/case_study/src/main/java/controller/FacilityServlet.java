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
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("max_people"));
        String standardRoom = request.getParameter("standard_room");
        String descriptionOther = request.getParameter("description_other_convenience");
        Double poolArea;
        if(request.getParameter("pool_area")==null){
            poolArea = null;
        }else {
            poolArea= Double.parseDouble(request.getParameter("pool_area"));
        }
        Integer numberOfFloors;
        if(request.getParameter("number_of_floors")==null){
            numberOfFloors = null;
        }else {
            numberOfFloors = Integer.parseInt(request.getParameter("number_of_floors"));
        }
        String facilityFree = request.getParameter("facility_free");
        String rentType = request.getParameter("rent_type_id");
        String facilityType = request.getParameter("facility_type_id");
        Facility facility = new Facility(id,name,area,cost,maxPeople,standardRoom,descriptionOther,poolArea,numberOfFloors,facilityFree,rentType,facilityType);
        iFacilityService.edit(facility);
        try {
            request.getRequestDispatcher("view/facility/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("max_people"));
        String standardRoom = request.getParameter("standard_room");
        String descriptionOther = request.getParameter("description_other_convenience");
        Double poolArea;
        if(request.getParameter("pool_area")==null){
            poolArea = null;
        }else {
            poolArea= Double.parseDouble(request.getParameter("pool_area"));
        }
        Integer numberOfFloors;
        if(request.getParameter("number_of_floors")==null){
            numberOfFloors = null;
        }else {
            numberOfFloors = Integer.parseInt(request.getParameter("number_of_floors"));
        }
        String facilityFree = request.getParameter("facility_free");
        String rentType = request.getParameter("rent_type_id");
        String facilityType = request.getParameter("facility_type_id");
        Facility facility = new Facility(name,area,cost,maxPeople,standardRoom,descriptionOther,poolArea,numberOfFloors,facilityFree,rentType,facilityType);
        iFacilityService.add(facility);
        try {
            request.getRequestDispatcher("view/facility/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

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
            case "delete":
                delete(request,response);
                break;
            case "search":
                search(request,response);
            default:
                list(request,response);
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String descriptionOther = request.getParameter("descriptionOther");
        List<Facility> facilityList =iFacilityService.search(name,descriptionOther);
        request.setAttribute("facilityList",facilityList);
        try {
            request.getRequestDispatcher("view/facility/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iFacilityService.deleteById(id);
        List<Facility> facilityList = iFacilityService.list();
        request.setAttribute("facilityList",facilityList);
        try {
            request.getRequestDispatcher("view/facility/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
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
        try {
            request.getRequestDispatcher("view/facility/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Facility facility = iFacilityService.showFormEdit(id);
        request.setAttribute("facility",facility);
        try {
            request.getRequestDispatcher("view/facility/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
