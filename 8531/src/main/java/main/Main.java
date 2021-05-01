package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a % b == 0 && a % c == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
