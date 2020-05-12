import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "ProductDiscountCalculatorServlet, urlPattern = "display-discount"")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String productDescription = request.getParameter("productDescription");
//        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
//        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
//
//        double discountAmount = listPrice * discountPercent * 0.01;
//        double discountPrice = listPrice - discountAmount ;
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h2>Product Description: " + productDescription + "</h2>");
//        writer.println("<h2>List Price: " + listPrice + "</h2>");
//        writer.println("<h2>Discount Percent: " + discountPercent + "</h2>");
//
//        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
//        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
//        writer.println("</html>");

        request.getRequestDispatcher("display-discount.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
