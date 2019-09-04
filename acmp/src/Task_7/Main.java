package Task_7;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String a = in.next();
        String b = in.next();
        String c = in.next();

        if (a >= b && a >= c) System.out.println(a);
        if (b >= a && b >= c) System.out.println(b);
        if (c >= a && c >= b) System.out.println(c);

     out.flush();
    }
}