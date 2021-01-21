package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int n1 = n;
	    int sum = 0;
	    int countOfDigits = (int) Math.log10(n) + 1;
        int simmetry = 0;
        if((countOfDigits & 1) == 1){
            simmetry = 1;
        }else
            simmetry = 0;
        countOfDigits /= 2;
        while (n1 != 0){
            sum = sum * 10 + n1 % 10;
            n1 /= 10;
        }
        while (countOfDigits != 0){
            if(n % 10 == sum % 10){
                simmetry++;
            }
            n /= 10;
            sum /= 10;
            countOfDigits--;
        }
        System.out.println(simmetry);
    }
}
