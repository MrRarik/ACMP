package Task_149;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = a; i >= 0; i--) {
            out.println(arr[i]);
        }

        out.flush();
    }
}
