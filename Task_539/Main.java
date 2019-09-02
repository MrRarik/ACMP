package Task_539;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if (a == 1) {
            out.println(0);
        } else if (a % 2 == 0) {
            out.println(a/2);
        } else {
           out.println(a);
        }
        out.flush();
    }
}
