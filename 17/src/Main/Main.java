package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trees = in.nextInt();
        long answer = 3 * (long) Math.pow(2, (trees - 1));
        System.out.println(answer);
    }
}
