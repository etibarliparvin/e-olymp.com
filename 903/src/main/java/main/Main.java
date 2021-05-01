package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int last = a % 10;
        int first = a / 100;
        System.out.println(last > first ? last : last == first ? "=" : first);
    }
}
