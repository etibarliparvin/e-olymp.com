package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit, n1, n = in.nextInt();
        n1 = n;
        if (n1 < 0) n1 *= -1;
        digit = (int) Math.log10(n1) + 1;
        System.out.println(n % 6 == 0 && digit == 2 ? "YES" : "NO");
    }
}
