package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double widt, length, answer, n = in.nextDouble();
        widt = Math.floor(Math.sqrt(n));
        length = Math.floor(Math.sqrt(n));
        answer = 2 * n + widt + Math.ceil(n / length);
        System.out.println((int) answer);
    }
}
