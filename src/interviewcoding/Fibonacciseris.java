package interviewcoding;

import java.util.Scanner;

public class Fibonacciseris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input .nextInt();
        int first  =  0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 3 ; i <= a ; i++)
        {
            int tepm =  first + second;
            first = second;
            second = tepm;
            System.out.println(tepm);
        }
    }
}
