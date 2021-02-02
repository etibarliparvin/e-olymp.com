package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n, k = 0, temp;
        double b = 0;
        while (Math.pow(2, k) < n) {
            b = Math.pow(2, k);
            k++;
        }
        k--;
        temp = (int) b; // verilmiw ededint ikilik say sisteminde reqemleri sayi qeder en kicik say tapilir.
        for (int i = 0; i < k; i++) {
            if ((n - temp) == 0) {
                break;
            } else if ((n - temp) > 0) {
                n -= temp;
                n <<= 1;
                n += 1;
            } else {
                n <<= 1;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
