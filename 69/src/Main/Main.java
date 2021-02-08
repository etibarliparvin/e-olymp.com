package Main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int friends = 0;
        int a = in.nextInt();
//        int b = in.nextInt();
        Vector<Integer> aa = new Vector<>();
//        Vector<Integer> bb = new Vector<>();
        for (int i = 0; i < a; i++) {
            aa.add(in.nextInt());
        }
//        for (int i = 0; i < a; i++) {
//            bb.add(in.nextInt());
//        }

//        while (!compare(aa, bb)) {
//            change(aa);
//            friends++;
//        }
//        System.out.println(friends);
        System.out.println(aa.elementAt(0));

    }

    public static boolean compare(Vector<Integer> aa, Vector<Integer> bb) {
        if (aa.size() != bb.size()) {
            return false;
        } else {
            for (int i = 0; i < aa.size(); i++) {
                if (aa.elementAt(i) != bb.elementAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static Vector<Integer> change(Vector<Integer> aa) {
        int first = aa.firstElement();
        aa.remove(0);
        int index = 0;
        while (first != 0 && index < aa.size()) {
            int x = aa.elementAt(index);
            x++;
            aa.add(index++, x);
            first--;
        }
        while (first != 0) {
            aa.add(index++, 1);
            first--;
        }
        return aa;
    }
}
