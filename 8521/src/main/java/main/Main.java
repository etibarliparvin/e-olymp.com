package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long y, x = in.nextInt();
        if (x < 10) {
            y = x * x - 2 * x + 4;
        } else {
            y = x * x * x + 5 * x;
        }
        System.out.println(y);
    }
}
