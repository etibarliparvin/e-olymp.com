package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if(x >= a && x <= b){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
