import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayServlet" , value = "/login")
public class DisplayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("list_price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount_percent"));
        float discountAmount=listPrice*discountPercent*0.01f;
        float discountPrice=listPrice-discountPercent;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Discount Amount: "+discountAmount+"<h3>");
        writer.println("<h3>Discount Price: "+discountPrice+"<h3>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
