package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int big = a;
        int small = a;
        int b = in.nextInt();
        if(b > big){
            big = b;
        }
        if(b < small){
            small = b;
        }
        int c = in.nextInt();
        if(c > big){
            big = c;
        }
        if(c < small){
            small = c;
        }
        System.out.println(a + b + c - (big + small));
    }
}
