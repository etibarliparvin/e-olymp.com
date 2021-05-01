package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n % 2 == 0) == (n % 3 == 0 && n < 0) ? "NO" : "YES");
    }
}
