package Task_697;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

       int l = in.nextInt();
       int w = in.nextInt();
       int h = in.nextInt();
       int n;
       int p = 0;
       n = (l*h) + (l*w);
       if (n % 16 == 0) {
           System.out.println(n / 16);
       } else {
           for (int i = 0; i < 16; i++) {
               if ((n + i) % 16 == 0) {
                   System.out.println((n + i) / 16);
               }
           }
       }

       System.out.println(p);
        out.flush();
    }

}

