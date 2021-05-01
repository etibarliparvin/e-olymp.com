package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n & 1) == 0 ? "EVEN" : "ODD");
    }
}
/*
Logical operators:
1. or ^
1 ^ 1 = 0
1 ^ 0 = 1
0 ^ 1 = 1
0 ^ 0 = 0

2. and &
1 & 1 = 1
0 & 1 = 0
0 & 0 = 0
1 & 0 = 0
 */
