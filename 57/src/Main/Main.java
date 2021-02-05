package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distance, x1, x2, y1, y2, z2;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        z2 = in.nextDouble();

        distance = 1 / Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + z2 * z2);
        System.out.printf("%.3f" , distance);
    }
}
