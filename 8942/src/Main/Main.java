package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < n; b++){
                if(a == 0 || a == 2 || b == 0 || b == n - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
