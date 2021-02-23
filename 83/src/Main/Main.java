package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        int flag = 0, day = 0, month = 0, year = 0;
        for(int i = 0; i < date.length(); i++){
            if(date.charAt(i) == '/'){
                flag++;
            }else {
                if(flag == 0){
                    day = day * 10 + (date.charAt(i) - 48);
                }else if(flag == 1){
                    month = month * 10 + (date.charAt(i) - 48);
                }else {
                    year = year * 10 + (date.charAt(i) - 48);
                }
            }
        }
        String result = reverse(day, day + 1) + "/" + reverse(month, day +1) + "/" + reverse(year, day + 1);
        System.out.println(result);
    }
    public static String reverse(int a, int b){
        String result = "";
        int remainder = 0;
        while (a != 0){
            remainder = a % b;
            if(remainder < 10){
                result = (char) (remainder + 48) + result;
            }else {
                result = (char) (remainder + 55) + result;
            }
            a /= b;
        }
        return result;
    }
}
