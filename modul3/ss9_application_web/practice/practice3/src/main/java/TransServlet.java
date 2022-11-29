import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "TransServlet" , value = "/trans")
public class TransServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("CHICKEN","Gà");
        map.put("COW","Bò");
        map.put("elephant","Voi");

        String search = request.getParameter("search");
        PrintWriter printWriter = response.getWriter();
        String result = map.get(search);
        printWriter.println("<html>");
        printWriter.println("<h1>ENGLISH" + search +"</h1>");
        printWriter.println("<h1>RESULT:" + result +"</h1>");

        printWriter.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
