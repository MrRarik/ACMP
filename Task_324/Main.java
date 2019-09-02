package Task_324;


import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String number = in.next();

        char a = number.charAt(0);
        char b = number.charAt(1);
        char c = number.charAt(2);
        char d = number.charAt(3);

        if (a == d && b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        out.flush();
    }

}

