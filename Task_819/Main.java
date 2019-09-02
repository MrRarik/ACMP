package Task_819;

import java.io.PrintWriter;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long s, v;
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();

        s = 2*(a*b+b*c+a*c);
        out.println(s);
        v = a*b*c;
        out.println(v);

        out.flush();
    }
}
