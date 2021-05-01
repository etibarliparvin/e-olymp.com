package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
