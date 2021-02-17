package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        answer = m / n + ".";
        int remain = m % n;
        m = remain * 10;
        for(int i = 0; i < k; i++){
            answer += m / n;
            remain = m % n;
            m = remain * 10;
        }
        System.out.println(answer);
    }
}
