package controller;

import model.Product;
import service.impl.IProductService;
import service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , value = "/product")
public class ProductServlet extends HttpServlet {
     private IProductService productService = new ProductService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "add":
                save(request,response);
                break;
            case "update":
                update(request,response);
                break;
            case "remove":
                deleteProduct(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "showList":
                showListProduct(request,response);
                break;
            case "view":
                viewProduct(request,response);
                break;


        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        String unit = request.getParameter("unit");
        String size = request.getParameter("size");
        Product product = this.productService.findByName(name);
        RequestDispatcher dispatcher ;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            product.setName(name);
            product.setPrice(price);
            product.setType(type);
            product.setUnit(unit);
            product.setSize(size);
            this.productService.update(name,price);
            request.setAttribute("product",product);
            request.setAttribute("messenger","Product information was updated");
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Product product = productService.findByName(name);
        this.productService.findByName(name);
        request.setAttribute("product",product);

    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Product products =  this.productService.findByName(name);
        this.productService.findByName(name);
        request.setAttribute("products", products);
        try {
            request.getRequestDispatcher("view/product/search.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void save(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        String unit = request.getParameter("unit");
        String size = request.getParameter("size");
        Product product = new Product( name, price,type, unit,size);
        this.productService.add(product);
        request.setAttribute("message", "Add new success");
        try {
            request.getRequestDispatcher("view/product/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Product product = this.productService.findByName(name);
        this.productService.delete(name);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("view/product/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
