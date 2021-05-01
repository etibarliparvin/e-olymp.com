package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a > 0 && a < 4){
            System.out.println("Initial");
        } else if(a > 3 && a < 7){
            System.out.println("Average");
        } else if(a > 6 && a < 10){
            System.out.println("Sufficient");
        } else {
            System.out.println("High");
        }
    }
}
