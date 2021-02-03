package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger c = in.nextBigInteger();
        BigInteger answer = new BigInteger("1");
        answer = answer.multiply(a).multiply(b).multiply(c).subtract(answer);
        System.out.println(answer);
    }
}
