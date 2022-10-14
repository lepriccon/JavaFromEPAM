package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.List;

public class LeastMost {
    public static void main(String[] args) {
        if (args.length != 0) {
            int least = Integer.parseInt(args[0]);
            int most = least;
            for (String a : args) {
                if (Integer.parseInt(a) > most) {
                    most = Integer.parseInt(a);
                } else {
                    least = Integer.parseInt(a);
                }
            }
            System.out.println("least: " + least);
            System.out.println("most: " + most);
        }
    }
}
