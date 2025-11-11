package jdbc;

import java.sql.*;
import java.util.SortedMap;

public class StudentDAO {
    public void AddStudent(String Name ,String  course) throws SQLException {
        Connection connection  = Dbconnection.connectdatabase();
        String Query = "INSERT INTO students(name,course) VALUES (?,?)";
        PreparedStatement statement  = connection.prepareStatement(Query);
        statement.setString(1,Name);
        statement.setString(2,course);
        statement.executeUpdate();
        System.out.println("Add student  record sucessfully");
    }
    public void ViewRecord() throws SQLException {
        Connection connection = Dbconnection.connectdatabase();
        String Query = "SELECT * FROM students";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(Query);
        while(result.next())
        {
            System.out.println("student name = " + result.getString(1));
            System.out.println("student course = " + result.getString(2));
            System.out.println("student Attenanes = " + result.getString(3));
            System.out.println("------------ END OF STUDENT  ------- ");
        }
    }
}
