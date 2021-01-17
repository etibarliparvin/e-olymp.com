package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if((int)Math.log10(i) + 1 > 2)
            return;
        System.out.printf("%d %d\n", i / 10, i % 10);
    }
}
