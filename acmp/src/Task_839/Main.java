package Task_839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        char[] b = a.toCharArray();
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) {
                c++;
            }
            if (i == b.length - 1) {
                if (c == '0') {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
