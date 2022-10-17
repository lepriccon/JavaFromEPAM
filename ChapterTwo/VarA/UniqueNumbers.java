package ChapterTwo.VarA;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        HashSet <Character> setUnique = new HashSet<>();
        double coefficient = 0;
        String winner = null;
        for (String a : args){
            int unique = 1;
            for (char b: a.toCharArray()){
                   if (!setUnique.add(b)){
                        unique += 1;
                   }
               }
            if (unique/a.length() > coefficient){
                winner = a;
                coefficient = unique/a.length();
            }
            setUnique.clear();
            }
        System.out.println(winner);
        }

    }
