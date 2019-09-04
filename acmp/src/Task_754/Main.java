package Task_754;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < 94 || a > 727 && b < 94 || b > 727 && c < 94 || c > 727) {
            out.println("Error");
        } else {
            if (a > b && a > c) out.println(a);
            if (b > a && b > c) out.println(b);
            if (c > a && c > b) out.println(c);
        }
        out.flush();
    }
}


