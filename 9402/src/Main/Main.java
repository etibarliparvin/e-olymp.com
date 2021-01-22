package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int a = 0; a < n; a++){
            for(int b = 0; b < m; b++){
                if(a == 0 || a == n - 1 || b == 0 || b == m - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
