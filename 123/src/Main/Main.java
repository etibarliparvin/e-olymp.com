package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        while (n / 5 > 0){
            answer += n / 5;
            n /= 5;
        }
        System.out.println(answer);
    }
}
