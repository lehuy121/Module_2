import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerListServlet", urlPatterns = "/customerList")
public class CustomerListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = Test.getCustomers();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

//    private List<Customer> getCustomers() {
//        Customer hoan = new Customer("Mai Van Hoan", "1983/08/20", "Ha Noi", "images/hoan.jpg");
//        Customer nam = new Customer("Nguyen Van Nam", "1983/08/21", "Bac Giang", "images/nam.jpg");
//        Customer hoa = new Customer("Nguyen Thai Hoa", "1983/08/20", "Ha Noi", "images/hoa.jpg");
//        Customer khoa = new Customer("Tran Dang Khoa", "1983/08/20", "Ha Noi", "images/khoa.jpg");
//        List<Customer> customerList = new ArrayList<>();
//        customerList.add(hoan);
//        customerList.add(nam);
//        customerList.add(hoa);
//        customerList.add(khoa);
//        return customerList;
//    }
}

