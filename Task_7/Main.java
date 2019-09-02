package Task_7;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String n = in.nextInt();
        String m = in.nextInt();
        String d = in.nextInt();

        n.replaceFirst("^0+(?!$)", "");
        m.replaceFirst("^0+(?!$)", "");
        d.replaceFirst("^0+(?!$)", "");

        long a = Long.parseLong(n);
        long b = Long.parseLong(m);
        long c = Long.parseLong(d);

        if (a >= b && a >= c) System.out.println(a);
        if (b >= a && b >= c) System.out.println(b);
        if (c >= a && c >= b) System.out.println(c);

     out.flush();
    }
}