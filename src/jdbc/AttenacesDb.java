package jdbc;

import java.sql.*;
import java.time.LocalDate;

public class AttenacesDb {
    public void AttencesStatus(int id ,String status) throws SQLException {
        Connection connection = Dbconnection.connectdatabase();
        String Query = "insert into Attendences(StudentId,DD,attenclass) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setInt(1,id);
        statement.setDate(2, Date.valueOf(LocalDate.now()));
        statement.setString(3,status);
        statement.executeUpdate();
        System.out.println("sucessfully updated for " + id);

    }
    public void ViewAttenes() throws SQLException {
        Connection connection = Dbconnection.connectdatabase();
        String Query = "select a.DD,s.name,a.attenclass from Attendences as a join students as s on a.StudentId = s.ID  ";
       // String query = "SELECT a.date, s.name, a.status FROM attendance a JOIN students s ON a.student_id = s.id ORDER BY a.date DESC";
       Statement statement= connection.createStatement();
       ResultSet result = statement.executeQuery(Query);
       while (result.next())
       {
           System.out.println("Date :" + result.getString("DD"));
           System.out.println("Name :" + result.getString("name"));
           System.out.println("Status :" + result.getString("attenclass"));
           System.out.println("------------END ----------");
       }
    }
}
