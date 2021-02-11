package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double result = 1 / ((1 / a) + (1 / b) + (1 / c));
        System.out.printf("%.2f", result);
    }
}
