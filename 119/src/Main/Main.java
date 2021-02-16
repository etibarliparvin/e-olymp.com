package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String answer = "";
        BigInteger one = new BigInteger("1");
        int count = 0;
        while (answer.length() != n.length()) {
            count++;
            one = one.shiftLeft(1);
            answer = one + answer;
        }
        System.out.println(count);
    }
}
