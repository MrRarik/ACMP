package Task_692;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int a = in.nextInt();

            if (a % 2 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
            out.flush();
        }
    }