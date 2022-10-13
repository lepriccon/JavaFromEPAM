package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvenAndOdd {
    public static void main(String[] args) {
        if (args.length != 0) {
            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();
            for (String a : args) {
                if (Integer.parseInt(a) % 2 == 0) {
                    even.add(Integer.parseInt(a));
                } else {
                    odd.add(Integer.parseInt(a));
                }
            }
            System.out.println("even: " + even.toString());
            System.out.println("odd: " + odd.toString());
        }
    }
}
