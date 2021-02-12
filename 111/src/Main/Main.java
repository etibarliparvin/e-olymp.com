package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int hits = 0;
        if (m1 > 0) {
            if (m1 <= 30) {
                hits++;
            }
            h1++;
        }
        while (h1 <= h2) {
            if (h1 % 12 == 0) {
                hits += 12;
            } else {
                hits += h1 % 12;
            }
            hits++;
            h1++;
        }
        if (m2 < 30) {
            hits--;
        }
        System.out.println(hits);
    }
}
