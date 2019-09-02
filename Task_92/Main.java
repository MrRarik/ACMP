package Task_92;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b, c;

        b = a*2/3;
        c = (a - b) / 2;

        out.println(c);
        out.println(b);
        out.println(c);

        out.flush();
    }
}

