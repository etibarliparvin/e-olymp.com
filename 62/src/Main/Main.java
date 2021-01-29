package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger big = in.nextBigInteger();
        BigInteger result = new BigInteger("1");
        for(int i = 2; i < 2002; i++){
            if(result.equals(big)){
                System.out.println(i - 1);
                break;
            }
            BigInteger temp = new BigInteger(String.valueOf(i));
            result = result.multiply(temp);
        }
    }
}
