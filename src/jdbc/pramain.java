package jdbc;

import javax.sound.midi.Soundbank;
import java.sql.SQLException;
import java.util.Scanner;

public class pramain {
    public static void main(String[] args) throws SQLException {
        prastudent student = new prastudent();
        praattences attences = new praattences();
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("welcome to attences data");
            System.out.println("add student");
            System.out.println("View Students = 2");
            System.out.println("Mark students Atttenaces = 3");
            System.out.println("View Students attenaces = 4 ");
            System.out.println("Exit out = 5");
            System.out.println("Enter choice");
            int choices = input.nextInt();
            switch (choices) {
                case 1:
                    System.out.println("add student 1");
                    String name = input.next();
                    System.out.println("enter the cources");
                    String cc = input.next();
                    student.addstudent(name, cc);
                    break;
                case 2:
                    student.viewstudent();
                    break;
                case 3 :
                    System.out.println("mark students ");
                    int id = input.nextInt() ;
                    input.nextLine();
                    System.out.println("enter the cc");
                    String ccc = input.next();
                    attences.mark(id,ccc);
                    break;
                case 4 :
                    attences.readdatabase();
                    break;

                    case 5 :
                   System.exit(0);


            }

        }

    }
}
