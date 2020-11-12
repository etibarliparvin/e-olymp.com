package EolympFromOneToTousand;

import java.util.Scanner;

public class eolymp10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trees = in.nextInt();
        double totalWater = 1 / (double) trees;
        while (totalWater <= 0.5){
            trees--;
            totalWater += 1 / (double) trees;
        }
        System.out.println(trees);
    }
}
