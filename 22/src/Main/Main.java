package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        for (; a <= b; a++) {
            if (prime(a) && prime(reverse(a))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean prime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n) {
        int answer = 0;
        while (n != 0) {
            answer = answer * 10 + n % 10;
            n /= 10;
        }
        return answer;
    }
}
