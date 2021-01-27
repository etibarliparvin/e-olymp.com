package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1;
        int sum = 0;
        int count = 0;
        while (n != 0){
            count++;
            n1 = n;
            sum = 0;
            while (n1 != 0){
                sum += n1 % 10;
                n1 /= 10;
            }
            n -= sum;
        }
        System.out.println(count);
    }
}
