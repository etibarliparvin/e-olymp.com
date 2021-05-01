package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n > 0 ? "Positive" : n == 0 ? "Zero" : "Negative");
    }
}
