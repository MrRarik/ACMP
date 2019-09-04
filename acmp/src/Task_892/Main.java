package Task_892;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if (a == 1 || a == 2 || a == 12)  {
            out.println("Winter");
        } else if (a == 3 || a == 4 || a == 5){
            out.println("Spring");
        }  else if (a == 6 || a == 7 || a == 8){
            out.println("Summer");
        } else if (a == 9 || a == 10 || a == 11){
            out.println("Autumn");
        } else {
            out.println("Error");
        }

        out.flush();
    }
}
