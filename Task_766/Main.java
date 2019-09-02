package Task_766;

import java.io.PrintWriter;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a * b >= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            out.flush();
        }
    }
