import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcSingleton {

        private static JdbcSingleton instance;
        private Connection connection;

        private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
        private static final String USER = "username-Ansu";
        private static final String PASS = "password";

        private JdbcSingleton() {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static JdbcSingleton getInstance() {
            if (instance == null) {
                synchronized (JdbcSingleton.class) {
                    if (instance == null) {
                        instance = new JdbcSingleton();
                    }
                }
            }
            return instance;
        }

        public Connection getConnection() {
            return connection;
        }

        public void closeConnection() {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

     class JdbcExample {
        public static void main(String[] args) {
            JdbcSingleton jdbcSingleton = JdbcSingleton.getInstance();
            Connection connection = jdbcSingleton.getConnection();

            jdbcSingleton.closeConnection();
        }
    }


