package interviewcoding;

import java.util.Scanner;

public class ReverseAno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a ;
        a = input.nextInt();
        int no=0;
        while(a > 0)
        {
            int temp = a % 10 ;
            no = no * 10 + temp ;
            a /=10;
        }
        System.out.println(no);
    }
}
