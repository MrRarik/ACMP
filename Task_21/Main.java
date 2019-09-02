package Task_21;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= b && a >= c && b >= c) System.out.println(a - c);
        if (a >= c && a >= b && c >= b) System.out.println(a - b);
        if (b >= a && b >= c && a >= c) System.out.println(b - c);
        if (b >= c && b >= a && c >= a) System.out.println(b - a);
        if (c >= a && c >= b && a >= b) System.out.println(c - b);
        if (c >= b && c >= a && b >= a) System.out.println(c - a);
        if (c == a && c == b) System.out.println(0);

        out.flush();
    }
}
