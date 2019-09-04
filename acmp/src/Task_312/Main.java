package Task_312;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] d = new int[c];

        for (int i = 1; i <= c; i++) {
           d[i] = a + ((i - 1) * (b - c));
            if (i == c) {
                System.out.println(d);
            }
        }
    }
}
