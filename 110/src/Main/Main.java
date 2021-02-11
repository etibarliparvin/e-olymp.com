package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = in.nextInt();
        while (i <= n){
            i <<= 1;
        }
        i >>= 1;
        if(i == n){
            System.out.println(0);
        }else {
            System.out.println(n - i);
        }
    }
}
