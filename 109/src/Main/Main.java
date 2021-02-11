package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        if (numbers > 0 && numbers < 26894) {
            if (numbers < 10) {
                System.out.println(numbers);
            } else if (numbers < 190) {
                numbers -= 9;
                if (numbers % 2 == 0) {
                    numbers = (numbers / 2) + 9;
                    System.out.println(numbers);
                } else {
                    System.out.println(0);
                    return;
                }
            } else if (numbers < 2890) {
                numbers -= 189;
                if (numbers % 3 == 0) {
                    numbers = (numbers / 3) + 99;
                    System.out.println(numbers);
                } else {
                    System.out.println(0);
                    return;
                }
            } else {
                numbers -= 2889;
                if (numbers % 4 == 0) {
                    numbers = (numbers / 4) + 999;
                    System.out.println(numbers);
                } else {
                    System.out.println(0);
                    return;
                }
            }
        }
    }
}
