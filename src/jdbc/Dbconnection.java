package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    public static Connection connectdatabase() throws SQLException {
        Connection con;
         String url = "jdbc:mysql://localhost:3306/TutionStudents";
         String NameDB = "root";
         String password = "raki@2004";
        con = DriverManager.getConnection(url,NameDB,password);
        return con;
    }

}
