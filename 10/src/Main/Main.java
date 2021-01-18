package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trees = in.nextInt();
        double totalWater = (double) 1 / trees;
        while (totalWater <= 0.5){
            trees--;
            totalWater += (double) 1 / trees;
        }
        System.out.println(trees);
    }
}
