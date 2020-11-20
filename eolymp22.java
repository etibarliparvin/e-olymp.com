package EolympFromOneToTousand;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class eolymp22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int say = 0;
        for( ; a <= b; a++){
            if(sade(a) == 1 && sade(ters(a)) == 1)
                say++;
        }
        System.out.println(say);
    }

    public static int sade(int a) {
        if(a == 1)
            return 0;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0)
                return 0;
        }
        return 1;
    }

    public static int ters(int a) {
        int sum = 0;
        while (a != 0) {
            sum = sum * 10 + a % 10;
            a /= 10;
        }
        return sum;
    }
}
