package controller;

import model.BenhAn;
import service.BenhAnService;
import service.IBenhAnService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet" , value = "/benhAn")
public class BenhAnServlet extends HttpServlet {
    private static IBenhAnService iBenhAnService =new BenhAnService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "sua":
                sua(request,response);
                break;
        }
    }

    private void sua(HttpServletRequest request, HttpServletResponse response) {
        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String tenBenhNhan = request.getParameter("tenBenhNhan");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("NgayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");
        BenhAn benhAn = new BenhAn(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien);
//        boolean xem =
                iBenhAnService.sua(benhAn);
//        String tinNhan ="Thêm mới không thành công!";
//        if(check){
//            tinNhan = "Thêm mới thành công!";
//        }
//        request.setAttribute("message",tinNhan);
        try {
            request.getRequestDispatcher("edit").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null)
            action="";
        switch (action){
            case "sua":
                oSua(request,response);
                break;
            case "xoa":
                xoa(request,response);
                break;
            default:
                danhSach(request,response);
                break;

        }
    }

    private void danhSach(HttpServletRequest request, HttpServletResponse response) {
        List<BenhAn> benhAnList = iBenhAnService.hienThiTatCa();
        request.setAttribute("benhAnList",benhAnList);
        try {
            request.getRequestDispatcher("view/danh_sach.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void xoa(HttpServletRequest request, HttpServletResponse response) {
        String ma = request.getParameter("ma");
        iBenhAnService.xoa(ma);
        List<BenhAn> benhAnList = iBenhAnService.danhSachSauXoa();
        request.setAttribute("benhAnList",benhAnList);
        try {
            request.getRequestDispatcher("view/danh_sach.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void oSua(HttpServletRequest request, HttpServletResponse response) {
        String ma  = request.getParameter("ma");
        BenhAn benhAn = iBenhAnService.suaBangMa(ma);
        request.setAttribute("benhAn",benhAn);
        try {
            request.getRequestDispatcher("view/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
