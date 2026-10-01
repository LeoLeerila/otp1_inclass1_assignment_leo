package ic1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    //private static final String URL = "jdbc:mariadb://host.docker.internal:3306/svg_travel_db";
    private static final String URL = "jdbc:mariadb://localhost:3306/icdb";
    private static final String USER = "root";
    private static final String PASSWORD = "example";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
