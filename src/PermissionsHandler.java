import java.util.List;
import java.util.Map;

public class PermissionsHandler {

    private final Map<Role, Permissions> map;

    public PermissionsHandler(Map<Role, Permissions> map) {
        this.map = map;
    }

    public void updatePermission(Role role, boolean isWrite, List<String> newPermissions){
        Permissions permissions = map.get(role);
        if(isWrite){
            permissions.setWritePermissions(newPermissions);
        } else {
            permissions.setReadPermissions(newPermissions);
        }
    }

    public List<String> getPermission(Role role, boolean isWrite) {
        Permissions permission = map.get(role);
        if(isWrite){
            return permission.getWritePermissions();
        } else {
            return permission.getReadPermissions();
        }
    }

}
