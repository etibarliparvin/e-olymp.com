package EolympFromOneToTousand;

import java.util.Scanner;

public class eolymp17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long trees = sc.nextLong();
        long product = 3;
        while (trees != 1){
            product *= 2;
            trees--;
        }
        System.out.println(product);
    }
}
