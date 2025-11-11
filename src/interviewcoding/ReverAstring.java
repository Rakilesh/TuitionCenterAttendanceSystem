package interviewcoding;

import java.util.Scanner;

public class ReverAstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a ;
        a = input.nextLine();
        String s = " ";
        for(int i = a.length() -1 ; i >= 0 ;i--)
        {
            s = s + a.charAt(i);
        }
        System.out.println(s);
    }
}
