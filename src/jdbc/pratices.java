package jdbc;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;

public class pratices {
    public static void main(String[] args) throws SQLException
    {
        //Readsql();
        //insetsql();
       // insertpep();
        //insertpep1();
        //predefine();
        //predefinein();
       // predefineinout();
       // commitevsauto();
        batch();

    }

    public static void Readsql() throws SQLException
    {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        String sql = "select * from stud";
        Connection connectio = DriverManager.getConnection(url, name, password);
        Statement query = connectio.createStatement();
        ResultSet RR = query.executeQuery(sql);
        while (RR.next())
        {
            System.out.println("id  = " + " " + RR.getInt(1));
            System.out.println("name = " + " " + RR.getString(2));
            System.out.println("gpa = " + " " + RR.getDouble(3));
        }
    }
    public static void insetsql() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        String sql = "insert into stud values (7,'amar',8.8)";
        Connection connectio = DriverManager.getConnection(url, name, password);
        Statement query = connectio.createStatement();
        int row  = query.executeUpdate(sql);
        System.out.println("insert one row ");

    }
    public static void insertpep() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        int id = 8;
        String names = "vimal";
        double val = 9.9;

        String sql = "insert into stud values (" + id + ",'" + names + "'," + val + ");";
        Connection connectio = DriverManager.getConnection(url, name, password);
        Statement query = connectio.createStatement();
        int row  = query.executeUpdate(sql);
        System.out.println("insert one row ");
    }
    public static void insertpep1() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        int id = 9;
        String names = "semmo";
        double val = 9.9;

        String sql = "insert into stud values (?,?,?);";

        Connection connectiot = DriverManager.getConnection(url, name, password);
        PreparedStatement pst = connectiot.prepareStatement(sql);
        pst.setInt(1,id);
        pst.setString(2,names);
        pst.setDouble(3,val);
        int row = pst.executeUpdate();
        System.out.println("insert row 1 sucess ");

    }
    public static void predefine () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        Connection connectiot = DriverManager.getConnection(url, name, password);
       CallableStatement cs = connectiot.prepareCall("{call class()}");
        ResultSet RR =  cs.executeQuery();

        while (RR.next())
        {
            System.out.println("id  = " + " " + RR.getInt(1));
            System.out.println("name = " + " " + RR.getString(2));
            System.out.println("gpa = " + " " + RR.getDouble(3));
        }
    }
    public static void predefinein () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        int idd = 1;
        Connection connectiot = DriverManager.getConnection(url, name, password);
        CallableStatement cs = connectiot.prepareCall("{call classs(?)}");
        cs.setInt(1,idd);
        ResultSet RR =  cs.executeQuery();

        while (RR.next())
        {
            System.out.println("id  = " + " " + RR.getInt(1));
            System.out.println("name = " + " " + RR.getString(2));
            System.out.println("gpa = " + " " + RR.getDouble(3));
        }
    }
    public static void predefineinout () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ st";
        String name = "root";
        String password = "raki@2004";
        int idd = 6;
        Connection connectiot = DriverManager.getConnection(url, name, password);
        CallableStatement cs = connectiot.prepareCall("{call classss(?,?)}");
        cs.setInt(1,idd);
        cs.registerOutParameter(2,Types.VARCHAR);
         cs.executeUpdate();

        System.out.println(cs.getString(2));
//        while (RR.next())
//        {
//            System.out.println("id  = " + " " + RR.getInt(1));
//            System.out.println("name = " + " " + RR.getString(2));
//            System.out.println("gpa = " + " " + RR.getDouble(3));
//        }
    }
    public  static void commitevsauto() throws SQLException {
       String url = "jdbc:mysql://localhost:3306/st";
       String name = "root";
       String pass = "raki@2004";
       Connection connection = DriverManager.getConnection(url,name,pass);
       String sql1 = "update stud set gpa = 5.1 where id = 1  ";
       String sql2 = "update stud set  gpa = 1.2 where id = 3 ";
       connection.setAutoCommit(false);
       Statement s = connection.createStatement();
       int row = s.executeUpdate(sql1);
        System.out.println(row);
        int row1 = s.executeUpdate(sql2);
        System.out.println(row1);
        if(row > 0 && row1 > 0)
        {
            connection.commit();
        }

    }
    public static void batch() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/st";
        String name = "root";
        String pass = "raki@2004";
        Connection connection = DriverManager.getConnection(url,name,pass);
        String sql1 = "update stud set gpa = 9.1 where id =  4 ";
        String sql2 = "update stud set gpa = 8.2 where id =  5 ";
        String sql3 = "update stud set gpa = 7.1 where id =  6 ";
        String sql4 = "update stud set gpa = 6.2 where id =  7 ";
        connection.setAutoCommit(false);
        Statement s = connection.createStatement();
        s.addBatch(sql1);
        s.addBatch(sql2);
        s.addBatch(sql3);
        s.addBatch(sql4);
        int [] arr = s.executeBatch();
        for (int i :arr)
        {
            if(i > 0)
                continue;
            else
                connection.rollback();
        }

        connection.commit();







    }


}
























