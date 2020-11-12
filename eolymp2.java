package EolympFromOneToTousand;

import java.util.Scanner;

public class eolymp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        if(a < 0)
            return;
        else if(a == 0){
            System.out.printf("1");
            return;
        }
        System.out.println((long) Math.log10(a) + 1);
    }
}
