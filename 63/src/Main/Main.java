package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a, b;
        long answer;
        a = in.nextLong();
        b = in.nextLong();
        answer = (a - 1) * (b - 1) + 1;
        System.out.println(answer);
    }
}
