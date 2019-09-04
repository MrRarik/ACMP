package Task_933;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t = in.nextInt();

        if (a > t) {
            System.out.println(a*b);
        }
        if (a <= t) {
            System.out.println(a*b + c*(t-a));
        }
    }
}
