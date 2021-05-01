package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(((n & 1) == 0 && n > 0) || ((n & 1) == 1) && n < 0){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
