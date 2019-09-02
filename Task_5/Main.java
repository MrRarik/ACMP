package Task_5;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int a = in.nextInt();
        int n = 0, m = 0;
        int[] b = new int[a];

        for (int i = 0; i <= a; i++) {
            b[i] = in.nextInt();
            if (b[i] % 2 == 0) {
                System.out.println(b[i]);
                n++;
            }
        }
        for (int o = 0; o <= a; o++) {
            if (b[o] % 2 != 0) {
                System.out.println(b[o]);
                m++;
            }
            if (n >= m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
                out.flush();
        }

    }
}
