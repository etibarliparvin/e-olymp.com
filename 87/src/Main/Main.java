package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        int count = 0, min = 0, max = 0;
        for (int i = 0; i < command.length(); i++) {
            if (count < min) {
                min = count;
            }
            if (count > max) {
                max = count;
            }
            if (command.charAt(i) == 'R') {
                count++;
            } else if (command.charAt(i) == 'L') {
                count--;
            }
        }
        if (count < min) {
            min = count;
        }
        if (count > max) {
            max = count;
        }
        System.out.println((max - min) + 1);
    }
}
