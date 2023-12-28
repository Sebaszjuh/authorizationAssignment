import java.lang.reflect.Field;
import java.util.Date;

public record Employee(String name, Date date_of_birth, String work_email, boolean is_exempt, String specialist_notes) {
}
