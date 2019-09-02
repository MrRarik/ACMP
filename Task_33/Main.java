package Task_33;

import java.io.PrintWriter;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int n = b - 1;
        int m = a - 1;
        System.out.println(n);
        System.out.println(m);

        out.flush();
    }
}
