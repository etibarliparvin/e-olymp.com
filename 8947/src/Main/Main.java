package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int flag = 0;
        for (int a = 0; a < n; a++) {
            if (a % 2 == 0) {
                for (int b = 0; b < n; b++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                if (flag % 2 == 0) {
                    for (int b = 0; b < n - 1; b++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    System.out.print("*");
                    for (int b = 1; b < n; b++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                flag++;
            }
        }
    }
}
