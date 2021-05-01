package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y, x = in.nextInt();
        if (x < -4) {
            y = x + 5;
        } else if (x > 7) {
            y = x * x * x + 2 * x;
        } else {
            y = x * x - 3 * x;
        }
        System.out.println(y);
    }
}
