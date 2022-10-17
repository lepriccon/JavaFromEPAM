package ChapterTwo.VarA;

import java.util.Arrays;
import java.util.Comparator;

public class Compare{
    public static void main(String[] args){

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(args, comparator);
        for (String a :
                args) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (int i = args.length-1; i >= 0; i--  ){
            System.out.print(args[i] + " ");
        }

    }


}
