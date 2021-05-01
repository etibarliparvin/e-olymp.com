package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1 || n == 2 || n == 12) {
            System.out.println("Winter");
        } else if (n > 2 && n < 6) {
            System.out.println("Spring");
        } else if (n > 5 && n < 9) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
