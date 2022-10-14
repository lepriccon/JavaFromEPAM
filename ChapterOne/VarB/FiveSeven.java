package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.List;

public class FiveSeven {
    public static void main(String[] args) {
        if (args.length != 0) {
            List<Integer> five = new ArrayList<>();
            List<Integer> seven = new ArrayList<>();
            for (String a : args) {
                if (Integer.parseInt(a) % 5 == 0) {
                    five.add(Integer.parseInt(a));
                }
                if (Integer.parseInt(a) % 7 == 0) {
                    seven.add(Integer.parseInt(a));
                }
            }
            System.out.println("five: " + five.toString());
            System.out.println("seven: " + seven.toString());
        }
    }
}
