package Task_3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = in.nextLong();
        out.println(a * a);

        out.flush();
    }
}
