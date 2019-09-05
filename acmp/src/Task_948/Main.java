package Task_948;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0,d = 0;
        if (a >= b) {
            System.out.println(1 + " " + b);
        } else {
            c = b % a;
            d = ((b - c) / a) + 1;
            System.out.println(d + " " + c);
        }
    }
}
