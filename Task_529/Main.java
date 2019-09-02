package Task_529;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        float x1 = in.nextInt();
        float y1 = in.nextInt();
        float x2 = in.nextInt();
        float y2 = in.nextInt();
        float d = 0;
        d = (x2 - x1)*(x2 - x1) +(y2 - y1)*(y2 - y1);
        System.out.println(Math.sqrt(d));

        out.flush();
    }

}
