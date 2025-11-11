package jdbc;

import java.sql.*;

public class jdbcconnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String pass = "raki@2004";
        String query = "select * from student";
        Connection con  = DriverManager.getConnection(url,user,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            System.out.println("id is" + " " + rs.getInt(1));
            System.out.println("name is" +" "+ rs.getString(2));
            System.out.println("dep is" + " " +rs.getString(3));
        }

//        con.close();
    }

}
