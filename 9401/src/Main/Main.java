package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a = n; a > 0; a--){
            for(int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
