package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.List;

public class NineAndThree {
    public static void main(String[] args) {
        if (args.length != 0) {
            List<Integer> nine = new ArrayList<>();
            List<Integer> three = new ArrayList<>();
            for (String a : args) {
                if (Integer.parseInt(a) % 3 == 0) {
                    three.add(Integer.parseInt(a));
                }
                if (Integer.parseInt(a) % 9 == 0){
                    nine.add(Integer.parseInt(a));
                }
            }
            System.out.println("nine: " + nine.toString());
            System.out.println("three: " + three.toString());
        }
    }
}
