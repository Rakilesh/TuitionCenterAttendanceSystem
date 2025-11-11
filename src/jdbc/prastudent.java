package jdbc;

import java.net.ConnectException;
import java.sql.*;

public class prastudent {
    public void addstudent(String name ,String cc) throws SQLException {
        Connection connection = pradbconnection.connectiondb();
        String Query = "insert into students (name,course) values (?,?)";
        //String Query = "INSERT INTO students(name,course) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setString(1,name);
        statement.setString(2,cc);
        statement.executeUpdate();
        System.out.println("ssucesssfulyyy");
    }
    public void viewstudent() throws SQLException {
        Connection connection = pradbconnection.connectiondb();
        String query = "select * from students" ;
        Statement ss = connection.createStatement();
         ResultSet rr = ss.executeQuery(query);
         while(rr.next())
         {
             System.out.println("name = " + rr.getString("name"));
         }

    }
}
