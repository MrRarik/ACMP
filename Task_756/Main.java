package Task_756;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int a = in.nextInt();
        int b = in.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println(a - 1);
        } else if (a == 2 && 2 > b) {
            System.out.println(b - 1);
            out.flush();
        }

    }
}
