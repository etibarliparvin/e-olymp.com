package EolympFromOneToTousand;

import java.util.Scanner;

public class elymp137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ededler = "";
        int n, i, max, temp, a, b;
        n = in.nextInt();
        int[] arr = new int[n];
        for(i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        a = arr[0];
        for(i = 1; i < n; i++){
            if(arr[i] > a){
                b = a;
                a = arr[i];
            }
            else
                b = arr[i];
            while(b != 0){
                a %= b;
                temp = b;
                b = a;
                a = temp;
            }
        }
        System.out.println(a);
    }
}
