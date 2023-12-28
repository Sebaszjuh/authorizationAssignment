import java.util.Date;

public class EmployeeHandler {

    private final Employee employee;

    public EmployeeHandler(String name, Date date_of_birth, String work_email, boolean is_exempt, String specialist_notes) {
        this.employee = new Employee(name, date_of_birth, work_email, is_exempt, specialist_notes);
    }

    public void read(Role role, String column, Employee employee){
        role.read(column, employee);
    }

    public void write(Role role, String column, String data, Employee employee){
        role.write(column, employee);
    }

    public Employee getEmployee() {
        return employee;
    }
}
