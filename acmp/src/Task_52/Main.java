package Task_52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();

        char a1 = a.charAt(0);
        char a2 = a.charAt(1);
        char a3 = a.charAt(2);
        char b1 = a.charAt(3);
        char b2 = a.charAt(4);
        char b3 = a.charAt(5);

        if (a1 + a2 + a3 == b1 + b2 + b3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
