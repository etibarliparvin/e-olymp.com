package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0, n = in.nextInt();
        int[] numbers = new int[n];
        int[] arr = new int[9];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int temp = numbers[i];
            temp--;
            arr[temp]++;
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(n - max);

    }
}
