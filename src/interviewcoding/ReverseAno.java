package interviewcoding;

import java.util.Scanner;

public class ReverseAno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int a ;
//        a = input.nextInt();
//        int no=0;
//        while(a > 0)
//        {
//            int temp = a % 10 ;
//            no = no * 10 + temp ;
//            a /=10;
//        }
        String a = input.next();
        String re = "";
        for (int i = 0; i < a.length(); i++)
        {
            int c = 0;
            for(int j = i+1 ;j< a.length();j++)
            {
                if(a.charAt(i) == a.charAt(j))
                    c++;
            }
            if(c==0)
                re = re + a.charAt(i);
            c=0;
        }
        a = re;

        System.out.println(a);
    }
}
