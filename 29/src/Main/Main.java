package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        int count = 0;
        while (! (n == reverse(n))){
            count++;
            n += reverse(n);
        }
        System.out.println(count);
    }

    public static long reverse(long n){
        long answer = 0;
        while (n != 0){
            answer = answer * 10 + n % 10;
            n /= 10;
        }
        return answer;
    }
}
