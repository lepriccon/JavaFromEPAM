package ChapterOne.VarB;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Sort implements Comparable<String>{
    private String o;

    public static void main(String[] args) {
        Arrays.sort(args);
        for (String a: args){
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int i = args.length-1; i >= 0; i--){
            System.out.print(args[i] + " ");
        }

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
