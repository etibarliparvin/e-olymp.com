package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = n;
        while (n1 != 0){
            int a = n1 % 10;
            if(a == 0){
                System.out.println("NO");
                return;
            }else if(n % a != 0){
                System.out.println("NO");
                return;
            }
            n1 /= 10;
        }
        System.out.println("YES");
    }
}
