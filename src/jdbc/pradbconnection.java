package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class pradbconnection {

    public static Connection connectiondb() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/TutionStudents";
        String root = "root";
        String pass = "raki@2004";
        Connection connection = DriverManager.getConnection(url,root ,pass);
        return connection;


    }
}
