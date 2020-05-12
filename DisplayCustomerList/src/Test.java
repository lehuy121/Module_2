import java.util.ArrayList;
import java.util.List;

public  class Test {
    public static List<Customer> getCustomers() {
        Customer hoan = new Customer("Mai Van Hoan", "1983/08/20", "Ha Noi", "images/hoan.jpg");
        Customer nam = new Customer("Nguyen Van Nam", "1983/08/21", "Bac Giang", "images/nam.jpg");
        Customer hoa = new Customer("Nguyen Thai Hoa", "1983/08/20", "Ha Noi", "images/hoa.jpg");
        Customer khoa = new Customer("Tran Dang Khoa", "1983/08/20", "Ha Noi", "images/khoa.jpg");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(hoan);
        customerList.add(nam);
        customerList.add(hoa);
        customerList.add(khoa);
        return customerList;
    }
}
