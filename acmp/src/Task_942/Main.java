package Task_942;

import java.io.PrintWriter;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int c1 = 0;
        int c2 = 0;
        int[] b = new int[a];

        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
            if (b[i] == 0) c1++;
            if (b[i] == 1) c2++;
        }

        if (c1 < c2) System.out.println(c1);
        if (c1 > c2) System.out.println(c2);
    }
}
