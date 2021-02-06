package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int head = in.nextInt();
        int tail = in.nextInt();
        int movements = 0;
        if (head % 2 == 1 && tail == 0) {
            System.out.println(-1);
            return;
        }
        if (tail % 2 == 1) {
            movements++;
            tail++;
        }
        if (head % 2 == 1) {
            if ((tail / 2) % 2 == 1) {
                movements += tail / 2 + (head + tail / 2) / 2;
            } else {
                tail += 2;
                movements += tail / 2 + (head + tail / 2) / 2 + 2;
            }
        } else {
            if ((tail / 2) % 2 == 1) {
                tail += 2;
                movements += tail / 2 + (head + tail / 2) / 2 + 2;
            } else {
                movements += tail / 2 + (head + tail / 2) / 2;
            }
        }
        System.out.println(movements);
    }
}
