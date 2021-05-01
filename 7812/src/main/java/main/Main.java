package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int max = a;
        int b = in.nextInt();
        if (b > max) max = b;
        int c = in.nextInt();
        if (c > max) max = c;
        int d = in.nextInt();
        if (d > max) max = d;
        System.out.println(max);
    }
}
