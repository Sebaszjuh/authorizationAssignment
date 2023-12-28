import java.util.List;

public class Permissions {

    private List<String> writePermissions;
    private List<String> readPermissions;

    public Permissions(List<String> writePermissions, List<String> readPermissions) {
        this.writePermissions = writePermissions;
        this.readPermissions = readPermissions;
    }

    public void setWritePermissions(List<String> writePermissions) {
        this.writePermissions = writePermissions;
    }

    public void setReadPermissions(List<String> readPermissions) {
        this.readPermissions = readPermissions;
    }

    public List<String> getWritePermissions() {
        return writePermissions;
    }

    public List<String> getReadPermissions() {
        return readPermissions;
    }
}