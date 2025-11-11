package interviewcoding;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String d = input.nextLine();
        pali(d);

    }

    static boolean pali(String d) {
        int r = d.length() - 1;
        for (int i = 0; i < d.length() / 2; i++) {
            if (d.charAt(i) != d.charAt(r)) {
                System.out.println("NOT A PALIDROME");
                return false;
            }
            r--;
        }
        System.out.println(" A PALIDROME");
        return true;
    }
}
