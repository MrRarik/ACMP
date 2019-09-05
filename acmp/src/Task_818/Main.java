package Task_818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] b = new int[a];
        long c;

        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
            c =+b[i];
            if (i == a - 1) {
                System.out.println(c - (a - 1));
                 }
            }
        }

    }
