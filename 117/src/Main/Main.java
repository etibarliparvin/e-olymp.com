package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] logs = new int[n];
        for (int i = 0; i < n; i++) {
            logs[i] = in.nextInt();
        }
        Arrays.sort(logs);
        int i, count, log = logs[n - 1];
        for (i = log; i > 0; i--) {
            count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (logs[j] / i >= 1) {
                    count += logs[j] / i;
                } else {
                    break;
                }
            }
            if (count >= m) {
                break;
            }
        }
        System.out.println(i);
    }
}
