import java.util.List;

public enum Role {

    EMPLOYEE {

        @Override
        public void write(String data, Employee employee) {

        }

        @Override
        public void read(String data, Employee employee) {
        }
    },
    ORGANIZATION {
        @Override
        public void write(String data, Employee employee) {
        }

        @Override
        public void read(String data, Employee employee) {
        }
    },
    PRODUCT_SPECIALIST {
        @Override
        public void write(String data, Employee employee) {

        }

        @Override
        public void read(String data, Employee employee) {

        }
    };

    public abstract void write(String data, Employee employee);
    public abstract void read(String data, Employee employee);

}
