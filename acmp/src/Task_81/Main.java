package Task_81;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] b = new int[a];
        int max = 0, min = 30000;

        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
           if ( max < b[i]) {
               max = b[i];
           }
           if (min > b[i]) {
               min = b[i];
           }
           if (i == b.length - 1) {
               System.out.println(min + " " + max);
           }
        }
    }
}
