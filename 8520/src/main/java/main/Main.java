package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y, x = in.nextInt();
        if(x < 5) {
            y = x * x - 3 * x + 4;
        } else {
            y = x + 7;
        }
        System.out.println(y);
    }
}
