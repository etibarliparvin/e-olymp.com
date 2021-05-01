package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n = in.nextInt();
        n1 = n;
        if (n1 < 0) n1 *= -1;
        int digits = (int) Math.log10(n1) + 1;
        if (((n & 1) == 1) || (n > 0 && digits == 3)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
