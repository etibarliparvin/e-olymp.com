package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        for(int i = a; i <= b; i++){
            if(prime(i) && !thirteen(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean prime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean thirteen(int n){
        while (n != 0){
            if(n % 10 == 3 && n / 10 % 10 == 1){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
