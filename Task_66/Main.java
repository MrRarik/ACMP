package Task_66;


import java.io.PrintWriter;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            String n = "pasdfghjklzxcvbnmqwertyuiop";

            char a = in.next().charAt(0);

            for (int i = 0; i < 26; i++) {
                if (n.charAt(i) == a) {
                    System.out.println(n.charAt(i+1));
                }
            }

            out.flush();
        }

    }

