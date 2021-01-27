package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (true){
            System.out.println(4 * n + " " + n * n);
            in = new Scanner(System.in);
            n = in.nextInt();
        }
    }
}
