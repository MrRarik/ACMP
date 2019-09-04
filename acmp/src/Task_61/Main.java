package Task_61;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = 0;
        int b = 0;
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int a4 = in.nextInt();
        int b4 = in.nextInt();

        a = a1 + a2 + a3 + a4;
        b = b1 + b2 + b3 + b4;

        if (a > b) out.println("1");
        if (a < b) out.println("2");
        if (a == b) out.println("DRAW");
        out.println();

        out.flush();
    }
}
