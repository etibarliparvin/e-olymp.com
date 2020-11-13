package EolympFromOneToTousand;

import jdk.jfr.Unsigned;

import java.math.BigInteger;
import java.util.Scanner;

public class eolymp135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long product, a, b, EKOB, temp;
        int i, n = in.nextInt();
        int[] arr = new int[n];
        for(i = 0; i < n; i++)
            arr[i] = in.nextInt();
        EKOB = arr[0];
        for(i = 1; i < n; i++){
            a = EKOB;
            b = arr[i];
            product = a * b;
            while (b != 0){
                a %= b;
                temp = b;
                b = a;
                a = temp;
            }
            EKOB = product / a;
        }
        if(EKOB != 0)
            System.out.println(EKOB);
    }
}
