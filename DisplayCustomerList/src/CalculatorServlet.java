import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/Calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    float first = Float.parseFloat(request.getParameter("first-operand"));
    float second = Float.parseFloat(request.getParameter("second-operand"));
    char operator = request.getParameter("operator").charAt(0);
    String result = Calculator.calculator(first, second, operator);
    request.setAttribute("result", result);
    request.getRequestDispatcher("/calculator.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
