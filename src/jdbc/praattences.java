package jdbc;

import com.mysql.cj.protocol.ResultsetRows;

import java.sql.*;
import java.time.LocalDate;

public class praattences {
    public void mark(int id , String  cc) throws SQLException {
        Connection connection = pradbconnection.connectiondb();
        String query = "insert into Attendences(StudentId,DD,attenclass) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,id);
        statement.setDate(2, Date.valueOf(LocalDate.now()));
        statement.setString(3,cc);
        statement.executeUpdate();
        System.out.println("sucesssfull");

    }
    public void readdatabase() throws SQLException {
        Connection connection = pradbconnection.connectiondb();
        String query = " select s.name, a.attenclass,a.DD from Attendences as a join students as s on a.StudentId = s.ID";
        Statement statement = connection.createStatement();
        ResultSet rr = statement.executeQuery(query);

        //String Query = "select a.DD,s.name,a.attenclass from Attendences as a join students as s on a.StudentId = s.ID  ";
        // String query = "SELECT a.date, s.name, a.status FROM attendance a JOIN students s ON a.student_id = s.id ORDER BY a.date DESC";
        //Statement statement= connection.createStatement();
        // result = statement.executeQuery(Query);
        while (rr.next())
        {
            System.out.println("Date :" + rr.getString("DD"));
            System.out.println("Name :" + rr.getString("name"));
            System.out.println("Status :" + rr.getString("attenclass"));
            System.out.println("------------END ----------");
        }

    }

}
