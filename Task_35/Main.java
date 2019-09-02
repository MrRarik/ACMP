package Task_35;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

       int a = in.nextInt();
       float[][] b = new float[a][a];
       float c = 0;

       for (int i = 0; i < a; i++) {
           for (int j = 0; j < a; j++) {
               b[i][j] = in.nextFloat();
           }
       }
        out.flush();
    }

}
