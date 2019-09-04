package Task_2;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int sum = 0;

        if (a > 0) {
            for (int i = 0; i <= a; i++) {
                sum=sum+i;
            }
        } else {
            for (int j = 0; j >= a; j--) {
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}