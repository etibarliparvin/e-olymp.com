package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0){
            System.out.println("No");
            return;
        }
        if (n < 0) n *= -1;
        int count = (int) Math.log10(n) + 1;
        if(count == 2){
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
