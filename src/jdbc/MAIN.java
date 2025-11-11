package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        StudentDAO student = new StudentDAO();
        AttenacesDb student1 = new AttenacesDb();
        while (true)
        {
            System.out.println("Tution students attenaces");
            System.out.println("Add Students = 1");
            System.out.println("View Students = 2");
            System.out.println("Mark students Atttenaces = 3");
            System.out.println("View Students attenaces = 4 ");
            System.out.println("Exit out = 5");
            System.out.println("Enter choice");
            int choices = input.nextInt();
            switch(choices)
            {
                case 1 :
                    System.out.println("Enter the student Name ");
                    String Name = input.next();
                    System.out.println("Enter the course");
                    String course = input.next();
                    student.AddStudent(Name,course);
                    break ;
                case 2 :
                    student.ViewRecord();
                    break;
                case 3:
                    System.out.println("Enter the student id = " );
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Status of student (Present / Absent = ");
                    String status = input.next();
                    student1.AttencesStatus(id,status);
                    break;
                case 4:
                    student1.ViewAttenes();
                    break;
                case 5:
                    System.out.println("-------EXIT OUT -----");
                    System.exit(0);
                    break;

            }

        }
    }
}
