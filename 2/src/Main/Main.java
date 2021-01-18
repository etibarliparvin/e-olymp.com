package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i < 0){
            return;
        }else if(i == 0){
            System.out.println(1);
            return;
        }
        System.out.println((int) Math.log10(i) + 1);
    }
}
