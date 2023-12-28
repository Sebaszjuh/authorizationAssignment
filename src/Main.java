import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeHandler employee = new EmployeeHandler("Name", new Date(), "test@test.nl", false, "12324");
        EmployeeHandler employee1 = new EmployeeHandler("Name", new Date(), "test@test.nl", false, "12324");
        employee.read(Role.PRODUCT_SPECIALIST, "work_email", employee1.getEmployee());
    }
}