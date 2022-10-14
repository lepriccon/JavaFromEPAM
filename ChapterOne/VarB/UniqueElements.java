package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        List<String> unique = new ArrayList<>();
        if (args.length != 0){
            for (String a : args ){
                boolean check = true;
                HashSet<Character> sort = new HashSet<>();
                for (char b: a.toCharArray()){
                    if (!sort.add(b)){
                        check = false;
                    }
                }
                if (check){
                    unique.add(a);
                }
            }
        }
        System.out.println(unique.toString());
    }
}
